package com.restaurante.repository;

import com.restaurante.model.Plato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio para la entidad Plato.
 * Aplica patrón DAO usando Spring Data JPA.
 * @author Jesus - ADSO SENA
 * Evidencia: GA7-220501096-AA3-EV01
 */
@Repository
public interface PlatoRepository extends JpaRepository<Plato, Long> {
    
}