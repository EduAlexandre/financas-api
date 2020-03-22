package com.fabricadesoftware.financas.api.service;

import com.fabricadesoftware.financas.api.model.Pessoa;
import com.fabricadesoftware.financas.api.repository.Pessoarepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    @Autowired
    private Pessoarepository pessoarepository;

    public Pessoa atualizar(Long codigo, Pessoa pessoa){
        Pessoa pessoaSalva = BuscarPessoaPeloCodigo(codigo);
        BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
        return pessoarepository.save(pessoaSalva);
    }

    public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
        Pessoa pessoaSalva = BuscarPessoaPeloCodigo(codigo);
        pessoaSalva.setAtivo(ativo);
        pessoarepository.save(pessoaSalva);
    }

    private Pessoa BuscarPessoaPeloCodigo(Long codigo) {
        return pessoarepository.findById(codigo)
                    .orElseThrow(() -> new EmptyResultDataAccessException(1));
    }


}
