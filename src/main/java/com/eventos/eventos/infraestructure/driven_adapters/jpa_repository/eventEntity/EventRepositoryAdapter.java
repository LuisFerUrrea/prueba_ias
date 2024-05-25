package com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.eventEntity;

import com.eventos.eventos.domain.model.event.EventModel;
import com.eventos.eventos.domain.model.event.eventgateway.EventRepository;
import com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.mappers.EventMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class EventRepositoryAdapter implements EventRepository {

    private final EventJpaRepository eventJpaRepository;
    private final EventMapper eventMapper;

    @Override
    public List<EventModel> listEvents() {
        List<EventEntity> eventEntityList = eventJpaRepository.findAll();

        List<EventModel> eventModelList = eventEntityList.stream()
                .map(eventMapper::EntityToModel).toList();
        return eventModelList;
    }
}
