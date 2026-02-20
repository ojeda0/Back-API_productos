package ies.alcores.api_productos.service;

import ies.alcores.api_productos.model.Categoria;
import ies.alcores.api_productos.model.Producto;
import ies.alcores.api_productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> findAll(){
        return this.productoRepository.findAll();
    }

    public List<Producto> findByCategoria(final String categoria) {

        //List<Producto> result = new ArrayList<>();
        //List<Producto> totales = this.findAll();

        return this.findAll().stream().filter(a -> a.getCategoria().getNombre().equalsIgnoreCase(categoria)).toList();

    }

//        for(Producto p : totales) {
//
//            if(p.getCategoria().getNombre().equalsIgnoreCase(categoria)) {
//
//                result.add(p);
//
//            }
//
//        }
//
//        return result;
//
//    }

}
