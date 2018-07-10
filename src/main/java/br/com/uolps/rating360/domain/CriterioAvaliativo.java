package br.com.uolps.rating360.domain;

import javax.persistence.*;

@Entity
@Table(
        name = "criterioAvaliativo"
)
public class CriterioAvaliativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;
    private Long id_cargo;
    private Long id_classe;
    private Long id_niv_cargo;
    private Long id_nivel;
    private Long id_tipo;
    private Long id_item;

    public CriterioAvaliativo(){}

    public CriterioAvaliativo(Long id_cargo, Long id_classe, Long id_niv_cargo, Long id_nivel, Long id_tipo, Long id_item) {
        this.id_cargo = id_cargo;
        this.id_classe = id_classe;
        this.id_niv_cargo = id_niv_cargo;
        this.id_nivel = id_nivel;
        this.id_tipo = id_tipo;
        this.id_item = id_item;
    }

    public Long getPk() {
        return pk;
    }

    public void setPk(Long pk) {
        this.pk = pk;
    }

    public Long getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(Long id_cargo) {
        this.id_cargo = id_cargo;
    }

    public Long getId_classe() {
        return id_classe;
    }

    public void setId_classe(Long id_classe) {
        this.id_classe = id_classe;
    }

    public Long getId_niv_cargo() {
        return id_niv_cargo;
    }

    public void setId_niv_cargo(Long id_niv_cargo) {
        this.id_niv_cargo = id_niv_cargo;
    }

    public Long getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(Long id_nivel) {
        this.id_nivel = id_nivel;
    }

    public Long getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Long id_tipo) {
        this.id_tipo = id_tipo;
    }

    public Long getId_item(Long i) {
        return id_item;
    }

    public void setId_item(Long id_item) {
        this.id_item = id_item;
    }
}
