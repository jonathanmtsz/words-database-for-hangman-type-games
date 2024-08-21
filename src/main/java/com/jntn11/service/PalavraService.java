package com.jntn11.service;

import com.jntn11.model.Palavra;

import java.util.List;
import java.util.Optional;

public interface PalavraService {
    Palavra adicionarPalavra(Palavra palavra);
    Palavra atualizarPalavra(Long id, Palavra palavra);
    void excluirPalavra(Long id);
    Optional<Palavra> buscarPalavraPorId(Long id);
    List<Palavra> listarTodosPalavra();
}
