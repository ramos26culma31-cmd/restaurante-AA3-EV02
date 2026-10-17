package com.restaurante.service;

import com.restaurante.model.Plato;
import com.restaurante.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlatoService {

    @Autowired
    private PlatoRepository platoRepository;

    public List<Plato> listarTodos() {
        return platoRepository.findAll();
    }

    public Plato guardar(Plato plato) {
        return platoRepository.save(plato);
    }

    public Plato buscarPorId(Long id) {
        return platoRepository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        platoRepository.deleteById(id);
    }
}