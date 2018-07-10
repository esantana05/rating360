package br.com.uolps.rating360.service.interfaces;

import br.com.uolps.rating360.domain.NivelCargo;

import java.util.List;

public interface NivelCargoService {

    void save(NivelCargo nivelCargo);

    void update(Long id, NivelCargo nivelCargo);

    void delete(Long id);

    NivelCargo findById(Long id);

    List<NivelCargo> findAll();
}
