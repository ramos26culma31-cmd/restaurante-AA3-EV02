package com.restaurante.controller;

import com.restaurante.model.Plato;
import com.restaurante.service.PlatoService;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/api/platos")
@CrossOrigin(origins = "*")
public class PlatoController {

    @Autowired
    private PlatoService platoService;

    @GetMapping
    public List<Plato> listar() {
        return platoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Plato buscar(@PathVariable Long id) {
        return platoService.buscarPorId(id);
    }

    @PostMapping
    public Plato crear(@Valid @RequestBody Plato plato) {
        return platoService.guardar(plato);
    }

    @PutMapping("/{id}")
    public Plato actualizar(@PathVariable Long id, @Valid @RequestBody  Plato plato) {
        plato.setId(id);
        return platoService.guardar(plato);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        platoService.eliminar(id);
    }
}