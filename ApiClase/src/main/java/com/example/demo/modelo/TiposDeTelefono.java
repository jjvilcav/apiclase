package com.example.demo.modelo;

import javax.persistence.*;

@Entity
@Table(name = "tipos_telefono")

public class TiposDeTelefono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipos;
    private String tipo;

    public TiposDeTelefono(){

    }

    public TiposDeTelefono(int idTipos, String tipo) {
        super();
        this.idTipos = idTipos;
        this.tipo = tipo;
    }

    public int getIdTipos() {
        return idTipos;
    }

    public void setIdTipos(int idTipos) {
        this.idTipos = idTipos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
