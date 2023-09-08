package com.taller.mecanica.Repositories;

import com.taller.mecanica.Entities.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes,Long> {
}
