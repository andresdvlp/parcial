package com.taller.mecanica.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "mecanicos")
public class Mecanicos {
    @Id
    private long idMecanico;
    private String nombreMecanico;
    private String apellidoMecanico;
    private int celularMecanico;
}
