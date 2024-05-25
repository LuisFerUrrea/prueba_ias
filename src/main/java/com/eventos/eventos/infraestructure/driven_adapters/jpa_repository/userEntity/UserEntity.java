package com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.userEntity;

import com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.eventEntity.EventEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne()
    @JoinColumn(name="event_id", nullable = false)
    private EventEntity event;
}
