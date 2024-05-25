package com.eventos.eventos.infraestructure.entry_points.api_rest;

import com.eventos.eventos.domain.model.event.EventModel;
import com.eventos.eventos.domain.usecase.event.EventUseCase;
import com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.eventEntity.EventEntity;
import com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.eventEntity.EventJpaRepository;
import com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.mappers.EventMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping()
public class EventControler {

   private final EventUseCase eventUseCase;

    @GetMapping("/list")
    public List<EventModel> listEvents() {
        try {
           return eventUseCase.listEvents();
        } catch (RuntimeException ex) {
            System.out.print("error: " +  ex.getMessage());
            return null;
        }
    }
}
