package br.com.uolps.rating360.dao.interfaces;

import br.com.uolps.rating360.domain.NivelAvaliacao;

import java.util.List;

public interface NivelAvaliacaoDao {

    void save(NivelAvaliacao nivelAvaliacao);

    void update(NivelAvaliacao nivelAvaliacao);

    void delete(Long id);

    NivelAvaliacao findById(Long id);

    List<NivelAvaliacao> findAll();
}
