package com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.eventEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventJpaRepository extends JpaRepository<EventEntity,Long> {
}
