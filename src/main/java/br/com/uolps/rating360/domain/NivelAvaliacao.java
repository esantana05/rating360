package br.com.uolps.rating360.domain;

import javax.persistence.*;

@Entity
@Table(
        name = "nivel_avaliacao"
)
public class NivelAvaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_nivel;
    private String nivel_avaliacao;

    public NivelAvaliacao(){}

    public NivelAvaliacao(String nivel_avaliacao) {
        this.nivel_avaliacao = nivel_avaliacao;
    }

    public int getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(int id_nivel) {
        this.id_nivel = id_nivel;
    }

    public String getNivel_avaliacao() {
        return nivel_avaliacao;
    }

    public void setNivel_avaliacao(String nivel_avaliacao) {
        this.nivel_avaliacao = nivel_avaliacao;
    }
}
