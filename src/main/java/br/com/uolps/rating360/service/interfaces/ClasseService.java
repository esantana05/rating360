package br.com.uolps.rating360.service.interfaces;

import br.com.uolps.rating360.domain.Classe;

import java.util.List;

public interface ClasseService {

    void save(Classe classe);

    void update(Long id, Classe classe);

    void delete(Long id);

    Classe findById(Long id);

    List<Classe> findAll();
}

