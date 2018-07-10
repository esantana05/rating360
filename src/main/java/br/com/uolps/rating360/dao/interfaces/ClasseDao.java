package br.com.uolps.rating360.dao.interfaces;

import br.com.uolps.rating360.domain.Classe;

import java.util.List;

public interface ClasseDao {

    void save(Classe classe);

    void update(Classe classe);

    void delete(Long id);

    Classe findById(Long id);

    List<Classe> findAll();

}

