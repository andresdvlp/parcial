package com.taller.mecanica.Controllers;

import com.taller.mecanica.Entities.Clientes;
import com.taller.mecanica.Services.Impl.ClienteImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteImpl cliente;

    @GetMapping()
    public List<Clientes> obtenerTodos() {
        return cliente.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Clientes obtenerPorId(@PathVariable long id) {
        return cliente.obtenerPorId(id);
    }

    @PostMapping("/guardar")
    public Clientes guardar(@RequestBody Clientes clientes) {
        return cliente.guardar(clientes);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        cliente.eliminar(id);
    }
}
