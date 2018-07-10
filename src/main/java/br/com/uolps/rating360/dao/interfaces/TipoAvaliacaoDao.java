package br.com.uolps.rating360.dao.interfaces;

import br.com.uolps.rating360.domain.TipoAvaliacao;

import java.util.List;

public interface TipoAvaliacaoDao {

    void save(TipoAvaliacao tipoAvaliacao);

    void update(TipoAvaliacao tipoAvaliacao);

    void delete(Long id);

    TipoAvaliacao findById(Long id);

    List<TipoAvaliacao> findAll();
}
