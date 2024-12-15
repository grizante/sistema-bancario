package grizante.microservices.core.product.sistemabancario.clients.controller;

import grizante.microservices.core.product.sistemabancario.clients.dto.CreateClientDto;
import grizante.microservices.core.product.sistemabancario.clients.dto.CreateClientDtoResponse;
import grizante.microservices.core.product.sistemabancario.clients.model.Client;
import grizante.microservices.core.product.sistemabancario.clients.service.ClientService;
import jakarta.validation.Valid;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public EntityModel<CreateClientDtoResponse> createClient(@Valid @RequestBody CreateClientDto dto) {
        Client client = clientService.createClient(dto);
        CreateClientDtoResponse result = new CreateClientDtoResponse(client.getExternalId());

        EntityModel<CreateClientDtoResponse> clientEntityModel = EntityModel.of(result);

        clientEntityModel.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(getClass()).getClientById(result.externalId())).withSelfRel());

        return clientEntityModel;
    }

    public Client getClientById(String id) {}
}
