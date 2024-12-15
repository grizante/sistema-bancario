package grizante.microservices.core.product.sistemabancario.clients.service;

import grizante.microservices.core.product.sistemabancario.clients.dto.CreateClientDto;
import grizante.microservices.core.product.sistemabancario.clients.model.Client;

public interface ClientService {
    Client createClient(CreateClientDto dto);
}
