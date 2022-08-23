package com.devsuperior.desafiotres.repositories;

import com.devsuperior.desafiotres.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
