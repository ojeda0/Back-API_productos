package ies.alcores.api_productos.repository;

import ies.alcores.api_productos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    @Query("select c from Categoria c where c.id between 1 and 5")
    List<Categoria> findIdBetween1and5();

}
