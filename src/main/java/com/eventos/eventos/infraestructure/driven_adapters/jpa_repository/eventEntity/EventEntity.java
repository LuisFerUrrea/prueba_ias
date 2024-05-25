package com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.eventEntity;

import com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.userEntity.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="event")
public class EventEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String date;

    private String location;

    @OneToMany(mappedBy = "event")
    private List<UserEntity> users;
}
