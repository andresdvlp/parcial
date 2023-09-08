package com.taller.mecanica.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "vehiculos")
public class Vehiculos {
    @Id
    private long idVechiculo;
    private String descripcionVehiculo;
    private String marcaCarro;
    private int modelo;

}
