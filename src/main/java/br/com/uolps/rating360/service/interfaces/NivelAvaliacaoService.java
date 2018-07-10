package br.com.uolps.rating360.service.interfaces;

import br.com.uolps.rating360.domain.NivelAvaliacao;

import java.util.List;

public interface NivelAvaliacaoService {

    void save(NivelAvaliacao nivelAvaliacao);

    void update(Long id, NivelAvaliacao nivelAvaliacao);

    void delete(Long id);

    NivelAvaliacao findById(Long id);

    List<NivelAvaliacao> findAll();
}
