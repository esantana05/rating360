package br.com.uolps.rating360.domain;

import javax.persistence.*;

@Entity
@Table(
        name = "profissional"
)
public class Profissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profissional;
    private String nome;
    private int id_cargo;
    private int id_niv_cargo;

    public Profissional(){}

    public Profissional(String nome, int id_cargo, int id_niv_cargo) {
        this.nome = nome;
        this.id_cargo = id_cargo;
        this.id_niv_cargo = id_niv_cargo;
    }

    public Long getId_profissional() {
        return id_profissional;
    }

    public void setId_profissional(Long id_profissional) {
        this.id_profissional = id_profissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public int getId_niv_cargo() {
        return id_niv_cargo;
    }

    public void setId_niv_cargo(int id_niv_cargo) {
        this.id_niv_cargo = id_niv_cargo;
    }
}
