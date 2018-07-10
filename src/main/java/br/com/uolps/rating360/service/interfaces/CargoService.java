package br.com.uolps.rating360.service.interfaces;

import br.com.uolps.rating360.domain.Cargo;

import java.util.List;

public interface CargoService {

    void save(Cargo cargo);

    void update(Long id, Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();

}
