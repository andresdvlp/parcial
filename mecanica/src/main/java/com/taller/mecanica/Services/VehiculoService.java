package com.taller.mecanica.Services;

import com.taller.mecanica.Entities.Clientes;
import com.taller.mecanica.Entities.Vehiculos;

import java.util.List;

public interface VehiculoService {
    List<Vehiculos> obtenerTodos();
    Vehiculos obtenerPorId(long id);
    Vehiculos guardar(Vehiculos Vehiculos);
    void eliminar(long id);
}
