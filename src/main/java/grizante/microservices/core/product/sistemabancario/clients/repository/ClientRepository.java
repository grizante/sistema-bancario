package grizante.microservices.core.product.sistemabancario.clients.repository;

import grizante.microservices.core.product.sistemabancario.clients.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
