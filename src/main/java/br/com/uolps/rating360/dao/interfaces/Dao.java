package br.com.uolps.rating360.dao.interfaces;

import java.util.List;

public interface Dao {

    void save(Object o);

    void update(Object o);

    void delete(Object o);

    Object findById(Long id);

    List<Object> findAll();
}
