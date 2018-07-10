package br.com.uolps.rating360.service.interfaces;

import br.com.uolps.rating360.domain.CriterioAvaliativo;

import java.util.List;

public interface CriterioAvaliativoService {

    void save(CriterioAvaliativo criterioAvaliativo);

    void update(Long id, CriterioAvaliativo criterioAvaliativo);

    void delete(Long id);

    CriterioAvaliativo findById(Long id);

    List<CriterioAvaliativo> findAll();

}
