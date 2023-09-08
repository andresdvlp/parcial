package com.taller.mecanica.Repositories;

import com.taller.mecanica.Entities.Vehiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculos,Long> {
}



