package com.taller.mecanica.Services;

import com.taller.mecanica.Entities.Mecanicos;

import java.util.List;

public interface MecanicoService {
    List<Mecanicos> obtenerTodos();
    Mecanicos obtenerPorId(long id);
    Mecanicos guardar(Mecanicos mecanico);
    void eliminar(long id);
}
