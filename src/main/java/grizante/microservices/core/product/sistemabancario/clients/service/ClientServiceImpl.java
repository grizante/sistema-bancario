package grizante.microservices.core.product.sistemabancario.clients.service;

import grizante.microservices.core.product.sistemabancario.clients.dto.CreateClientDto;
import grizante.microservices.core.product.sistemabancario.clients.mapper.ClientMapper;
import grizante.microservices.core.product.sistemabancario.clients.model.Client;
import grizante.microservices.core.product.sistemabancario.clients.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ClientMapper clientMapper) {
        this.clientRepository = clientRepository;
        this.clientMapper = clientMapper;
    }

    @Override
    public Client createClient(CreateClientDto dto) {
        Client client = clientMapper.toEntity(dto);
        client.setExternalId("clt-" + UUID.randomUUID());
        return clientRepository.save(client);
    }
}
