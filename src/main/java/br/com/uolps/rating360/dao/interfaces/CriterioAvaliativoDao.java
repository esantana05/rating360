package br.com.uolps.rating360.dao.interfaces;

import br.com.uolps.rating360.domain.CriterioAvaliativo;

import java.util.List;

public interface CriterioAvaliativoDao {

    void save(CriterioAvaliativo criterioAvaliativo);

    void update(CriterioAvaliativo criterioAvaliativo);

    void delete(Long id);

    CriterioAvaliativo findById(Long id);

    List<CriterioAvaliativo> findAll();
}
