package com.eventos.eventos.domain.model.event;

import com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.userEntity.UserEntity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class EventModel {
    private Long id;

    private String name;

    private String date;

    private String location;

    private List<UserEntity> users;
}
