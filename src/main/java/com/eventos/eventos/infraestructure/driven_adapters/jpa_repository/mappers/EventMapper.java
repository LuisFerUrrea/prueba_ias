package com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.mappers;

import com.eventos.eventos.domain.model.event.EventModel;
import com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.eventEntity.EventEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Objects;

@AllArgsConstructor
@Component
public class EventMapper implements Mapper<EventModel, EventEntity>{
    @Override
    public EventEntity ModelToEntity(EventModel eventModel) {

        return null;
    }

    @Override
    public EventModel EntityToModel(EventEntity eventEntity) {
       if(Objects.isNull(eventEntity)){
           return null;
       }else {
           return  new EventModel
                   (eventEntity.getId(),eventEntity.getName(),eventEntity.getDate(),eventEntity.getLocation(),null);

       }
    }
}
