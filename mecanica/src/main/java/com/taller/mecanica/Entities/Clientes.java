package com.taller.mecanica.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table
public class Clientes {

    @Id
    private long idCliente;
    private String nombreCliente;
    private String apellidoCliente;
    private String correoCliente;
    private int celularCliente;

    public Clientes() {
    }

    public Clientes(long idCliente, String nombreCliente, String apellidoCliente, String correoCliente, int celularCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoCliente = correoCliente;
        this.celularCliente = celularCliente;
    }
}
