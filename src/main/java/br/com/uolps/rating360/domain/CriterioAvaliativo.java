package br.com.uolps.rating360.domain;

import javax.persistence.*;

@Entity
@Table(
        name = "criterio_avaliativo"
)
public class CriterioAvaliativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pk;
    private int id_cargo;
    private int id_classe;
    private int id_niv_cargo;
    private int id_nivel;
    private int id_tipo;
    private int id_item;

    public CriterioAvaliativo(){}

    public CriterioAvaliativo(int id_cargo, int id_classe, int id_niv_cargo, int id_nivel, int id_tipo, int id_item) {
        this.id_cargo = id_cargo;
        this.id_classe = id_classe;
        this.id_niv_cargo = id_niv_cargo;
        this.id_nivel = id_nivel;
        this.id_tipo = id_tipo;
        this.id_item = id_item;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        this.pk = pk;
    }

    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public int getId_classe() {
        return id_classe;
    }

    public void setId_classe(int id_classe) {
        this.id_classe = id_classe;
    }

    public int getId_niv_cargo() {
        return id_niv_cargo;
    }

    public void setId_niv_cargo(int id_niv_cargo) {
        this.id_niv_cargo = id_niv_cargo;
    }

    public int getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(int id_nivel) {
        this.id_nivel = id_nivel;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public int getId_item(int i) {
        return id_item;
    }

    public void setId_item(int id_item) {
        this.id_item = id_item;
    }
}
