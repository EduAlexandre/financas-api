package com.fabricadesoftware.financas.api.repository;

import com.fabricadesoftware.financas.api.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Pessoarepository extends JpaRepository<Pessoa, Long> {
}
