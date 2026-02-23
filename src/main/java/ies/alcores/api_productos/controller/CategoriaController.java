package ies.alcores.api_productos.controller;

import ies.alcores.api_productos.model.Categoria;
import ies.alcores.api_productos.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> listar() {

        return ResponseEntity.ok(this.categoriaService.findAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> obtenerPorID(@PathVariable long id) {

        return this.categoriaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("query1")
    public ResponseEntity<List<Categoria>> query1() {

        return ResponseEntity.ok(this.categoriaService.findIdBetween1and5());

    }
}
