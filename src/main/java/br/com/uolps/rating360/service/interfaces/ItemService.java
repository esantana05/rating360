package br.com.uolps.rating360.service.interfaces;

import br.com.uolps.rating360.domain.Item;

import java.util.List;

public interface ItemService {

    void save(Item item);

    void update(Long id, Item item);

    void delete(Long id);

    Item findById(Long id);

    List<Item> findAll();
}
