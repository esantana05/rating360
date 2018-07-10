package br.com.uolps.rating360.domain;

import javax.persistence.*;

@Entity
@Table(
        name = "tipoAvaliacao"
)
public class TipoAvaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tipo;
    private String tipo_avaliacao;

    public TipoAvaliacao(){}

    public TipoAvaliacao(String tipo_avaliacao) {
        this.tipo_avaliacao = tipo_avaliacao;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getTipo_avaliacao() {
        return tipo_avaliacao;
    }

    public void setTipo_avaliacao(String tipo_avaliacao) {
        this.tipo_avaliacao = tipo_avaliacao;
    }
}
