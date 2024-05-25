package com.eventos.eventos.domain.model.event.eventgateway;

import com.eventos.eventos.domain.model.event.EventModel;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EventRepository {
    List<EventModel> listEvents();
}
