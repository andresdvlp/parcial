package com.taller.mecanica.Controllers;

import com.taller.mecanica.Entities.Mecanicos;
import com.taller.mecanica.Services.Impl.MecanicoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/mecanicos")
public class MecanicoController {

    @Autowired
    private MecanicoImpl mecanicoService;

    @GetMapping()
    public List<Mecanicos> obtenerTodos() {
        return mecanicoService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Mecanicos obtenerPorId(@PathVariable long id) {
        return mecanicoService.obtenerPorId(id);
    }

    @PostMapping("/guardar")
    public Mecanicos guardar(@RequestBody Mecanicos mecanico) {
        return mecanicoService.guardar(mecanico);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable long id) {
        mecanicoService.eliminar(id);
    }

}
