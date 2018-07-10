package br.com.uolps.rating360.domain;

import javax.persistence.*;

@Entity
@Table(
        name = "item"
)
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_item;
    private String nome_item;

    public Item(){}

    public Item(String nome_item) {
        this.nome_item = nome_item;
    }

    public Long getId_item() {
        return id_item;
    }

    public void setId_item(Long id_item) {
        this.id_item = id_item;
    }

    public String getNome_item() {
        return nome_item;
    }

    public void setNome_item(String nome_item) {
        this.nome_item = nome_item;
    }
}
