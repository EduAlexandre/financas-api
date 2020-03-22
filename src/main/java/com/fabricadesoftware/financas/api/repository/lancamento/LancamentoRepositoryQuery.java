package com.fabricadesoftware.financas.api.repository.lancamento;

import com.fabricadesoftware.financas.api.model.Lancamento;
import com.fabricadesoftware.financas.api.repository.filter.LancamentoFilter;
import com.fabricadesoftware.financas.api.repository.projection.ResumoLancamento;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LancamentoRepositoryQuery {

    public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
    public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
}
