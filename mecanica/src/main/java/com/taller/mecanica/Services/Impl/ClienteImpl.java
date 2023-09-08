package com.taller.mecanica.Services.Impl;

import com.taller.mecanica.Entities.Clientes;
import com.taller.mecanica.Repositories.ClientesRepository;
import com.taller.mecanica.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImpl implements ClienteService {

    @Autowired
    private ClientesRepository clientesRepository;
    @Override
    public List<Clientes> obtenerTodos() {
        return clientesRepository.findAll();
    }

    @Override
    public Clientes obtenerPorId(long id) {
        return clientesRepository.findById(id).orElse(null);
    }

    @Override
    public Clientes guardar(Clientes clientes) {
        return clientesRepository.save(clientes);
    }

    @Override
    public void eliminar(long id) {
        clientesRepository.deleteById(id);
    }
}
