package br.com.uolps.rating360.dao.interfaces;

import br.com.uolps.rating360.domain.NivelCargo;

import java.util.List;

public interface NivelCargoDao {

    void save(NivelCargo nivelCargo);

    void update(NivelCargo nivelCargo);

    void delete(Long id);

    NivelCargo findById(Long id);

    List<NivelCargo> findAll();
}
