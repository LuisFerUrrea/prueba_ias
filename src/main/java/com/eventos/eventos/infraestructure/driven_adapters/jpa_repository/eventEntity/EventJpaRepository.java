package com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.eventEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventJpaRepository extends JpaRepository<EventEntity,Long> {
}
