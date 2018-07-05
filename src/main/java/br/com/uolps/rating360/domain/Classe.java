package br.com.uolps.rating360.domain;

import javax.persistence.*;

@Entity
@Table(
        name = "classe"
)
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_classe;
    private String nome_classe;

    public Classe(){}

    public Classe(String nome_classe) {
        this.nome_classe = nome_classe;
    }

    public Long getId_classe() {
        return id_classe;
    }

    public void setId_classe(Long id_classe) {
        this.id_classe = id_classe;
    }

    public String getNome_classe() {
        return nome_classe;
    }

    public void setNome_classe(String nome_classe) {
        this.nome_classe = nome_classe;
    }
}
