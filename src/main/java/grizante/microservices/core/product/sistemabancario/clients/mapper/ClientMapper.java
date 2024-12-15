package grizante.microservices.core.product.sistemabancario.clients.mapper;

import grizante.microservices.core.product.sistemabancario.clients.dto.CreateClientDto;
import grizante.microservices.core.product.sistemabancario.clients.model.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(target = "externalId", ignore = true, expression = "java(UUID.randomUUID().toString())")
    @Mapping(target = "createdAt", ignore = true, expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "updatedAt", ignore = true, expression = "java(java.time.LocalDateTime.now())")
    Client toEntity(CreateClientDto dto);
}
