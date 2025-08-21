package com.fernandodev.usuario.infrastructure.repository;

import com.fernandodev.aprendendospring.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
