package com.eventos.eventos.domain.usecase.event;

import com.eventos.eventos.domain.model.event.EventModel;
import com.eventos.eventos.domain.model.event.eventgateway.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EventUseCase {
    private final EventRepository eventRepository;

    public List<EventModel> listEvents(){
       return eventRepository.listEvents();
    }

}
