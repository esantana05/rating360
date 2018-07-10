package br.com.uolps.rating360.service.interfaces;

import br.com.uolps.rating360.domain.TipoAvaliacao;

import java.util.List;

public interface TipoAvaliacaoService {

    void save(TipoAvaliacao tipoAvaliacao);

    void update(Long id, TipoAvaliacao tipoAvaliacao);

    void delete(Long id);

    TipoAvaliacao findById(Long id);

    List<TipoAvaliacao> findAll();
}
