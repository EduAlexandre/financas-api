package com.fabricadesoftware.financas.api.service;

import com.fabricadesoftware.financas.api.model.Lancamento;
import com.fabricadesoftware.financas.api.model.Pessoa;
import com.fabricadesoftware.financas.api.repository.LancamentoRepository;
import com.fabricadesoftware.financas.api.repository.Pessoarepository;
import com.fabricadesoftware.financas.api.service.exception.PessoaInexistenteOuInativaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @Autowired
    private Pessoarepository pessoarepository;

    public Lancamento salvar(Lancamento lancamento) {
        Optional<Pessoa> pessoa = pessoarepository.findById(lancamento.getPessoa().getCodigo());
        if (pessoa == null || !pessoa.isPresent()){
            throw new PessoaInexistenteOuInativaException();
        }
        return lancamentoRepository.save(lancamento);
    }
}
