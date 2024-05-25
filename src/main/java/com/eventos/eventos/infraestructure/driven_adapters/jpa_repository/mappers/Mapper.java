package com.eventos.eventos.infraestructure.driven_adapters.jpa_repository.mappers;

public interface Mapper<Model,Entity>{
    Entity ModelToEntity(Model model);
    Model EntityToModel(Entity entity);
}
