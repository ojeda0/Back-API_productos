package ies.alcores.api_productos.service;

import ies.alcores.api_productos.model.Categoria;
import ies.alcores.api_productos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {

        return this.categoriaRepository.findAll();

    }

    public Optional<Categoria> findById(Long id) {

        return this.categoriaRepository.findById(id);

    }

    public List<Categoria> findIdBetween1and5() {

        return this.categoriaRepository.findIdBetween1and5();

    }

}
