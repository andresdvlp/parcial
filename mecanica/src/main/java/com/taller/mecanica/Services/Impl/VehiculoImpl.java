package com.taller.mecanica.Services.Impl;

import com.taller.mecanica.Entities.Vehiculos;
import com.taller.mecanica.Repositories.VehiculoRepository;
import com.taller.mecanica.Services.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public List<Vehiculos> obtenerTodos() {
        return vehiculoRepository.findAll();
    }

    @Override
    public Vehiculos obtenerPorId(long id) {
        return vehiculoRepository.findById(id).orElse(null);
    }

    @Override
    public Vehiculos guardar(Vehiculos vehiculos) {
        return vehiculoRepository.save(vehiculos);
    }

    @Override
    public void eliminar(long id) {
    vehiculoRepository.deleteById(id);
    }
}
