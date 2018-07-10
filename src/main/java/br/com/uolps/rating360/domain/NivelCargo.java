package br.com.uolps.rating360.domain;


import javax.persistence.*;

@Entity
@Table(
        name = "nivelCargo"
)
public class NivelCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_niv_cargo;
    private String nivel_cargo;

    public NivelCargo(){}

    public NivelCargo(String nivel_cargo) {
        this.nivel_cargo = nivel_cargo;
    }

    public Long getId_niv_cargo() {
        return id_niv_cargo;
    }

    public void setId_niv_cargo(Long id_niv_cargo) {
        this.id_niv_cargo = id_niv_cargo;
    }

    public String getNivel_cargo() {
        return nivel_cargo;
    }

    public void setNivel_cargo(String nivel_cargo) {
        this.nivel_cargo = nivel_cargo;
    }
}
