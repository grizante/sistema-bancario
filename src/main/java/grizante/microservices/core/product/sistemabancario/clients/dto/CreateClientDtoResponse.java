package grizante.microservices.core.product.sistemabancario.clients.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

public record CreateClientDtoResponse(
        @Schema(example = "clt-74d72c4c-88b3-4d2d-9469-cd1e2210754b", description = "Client identifier") @NotNull @JsonAlias("external_id") String externalId) {
}
