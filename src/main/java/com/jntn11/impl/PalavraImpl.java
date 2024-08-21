package com.jntn11.impl;

import com.jntn11.model.Palavra;
import com.jntn11.repository.PalavraRepository;
import com.jntn11.service.PalavraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PalavraImpl implements PalavraService {

    private final PalavraRepository palavraRepository;

    @Autowired
    public PalavraImpl(PalavraRepository palavraRepository) {
        this.palavraRepository = palavraRepository;
    }

    @Override
    public Palavra adicionarPalavra(Palavra palavra) {
        return null;
    }

    @Override
    public Palavra atualizarPalavra(Long id, Palavra palavra) {
        return null;
    }

    @Override
    public void excluirPalavra(Long id) {

    }

    @Override
    public Optional<Palavra> buscarPalavraPorId(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Palavra> listarTodosPalavra() {
        return List.of();
    }
}
