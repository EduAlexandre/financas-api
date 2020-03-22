package com.fabricadesoftware.financas.api.repository;

import com.fabricadesoftware.financas.api.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
