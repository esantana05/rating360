package br.com.uolps.rating360.domain;

import javax.persistence.*;

@Entity
@Table(
        name = "cargo"
)
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cargo;

    @Column(nullable = false)
    private String nome_cargo;

    public Cargo(){

    }

    public Cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }

    public Long getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Long id_cargo) {
        this.id_cargo = id_cargo;
    }

    public String getNome_cargo() {
        return nome_cargo;
    }

    public void setNome_cargo(String nome_cargo) {
        this.nome_cargo = nome_cargo;
    }
}
