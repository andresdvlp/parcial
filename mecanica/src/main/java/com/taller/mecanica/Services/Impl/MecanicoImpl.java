package com.taller.mecanica.Services.Impl;

import com.taller.mecanica.Entities.Mecanicos;
import com.taller.mecanica.Repositories.MecanicoRepository;
import com.taller.mecanica.Services.MecanicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MecanicoImpl implements MecanicoService {

    @Autowired
    private MecanicoRepository mecanicoRepository;

    @Override
    public List<Mecanicos> obtenerTodos() {
        return mecanicoRepository.findAll();
    }

    @Override
    public Mecanicos obtenerPorId(long id) {
        return mecanicoRepository.findById(id).orElse(null);
    }

    @Override
    public Mecanicos guardar(Mecanicos mecanico) {
        return mecanicoRepository.save(mecanico);
    }

    @Override
    public void eliminar(long id) {
        mecanicoRepository.deleteById(id);
    }
}
