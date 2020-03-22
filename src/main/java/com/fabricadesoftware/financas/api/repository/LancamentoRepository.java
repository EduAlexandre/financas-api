package com.fabricadesoftware.financas.api.repository;

import com.fabricadesoftware.financas.api.model.Lancamento;
import com.fabricadesoftware.financas.api.repository.lancamento.LancamentoRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {
}
