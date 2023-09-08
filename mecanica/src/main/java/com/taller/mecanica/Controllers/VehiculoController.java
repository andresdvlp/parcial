package com.taller.mecanica.Controllers;

import com.taller.mecanica.Entities.Vehiculos;
import com.taller.mecanica.Services.Impl.VehiculoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoImpl vehiculoService;

    @GetMapping()
    public List<Vehiculos> obtenerTodos() {
        return vehiculoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Vehiculos obtenerPorId(@PathVariable long id) {
        return vehiculoService.obtenerPorId(id);
    }

    @PostMapping("/guardar")
    public Vehiculos guardar(@RequestBody Vehiculos vehiculos) {
        return vehiculoService.guardar(vehiculos);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        vehiculoService.eliminar(id);
    }
}
