package com.taller.mecanica.Repositories;

import com.taller.mecanica.Entities.Mecanicos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MecanicoRepository extends JpaRepository<Mecanicos, Long> {
}
