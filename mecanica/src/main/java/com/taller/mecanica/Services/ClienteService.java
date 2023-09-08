package com.taller.mecanica.Services;

import com.taller.mecanica.Entities.Clientes;
import com.taller.mecanica.Entities.Mecanicos;

import java.util.List;

public interface ClienteService {

    List<Clientes> obtenerTodos();
    Clientes obtenerPorId(long id);
    Clientes guardar(Clientes clientes);
    void eliminar(long id);
}
