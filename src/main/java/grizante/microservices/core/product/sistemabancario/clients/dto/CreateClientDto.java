package grizante.microservices.core.product.sistemabancario.clients.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

public record CreateClientDto(
        @Schema(minLength = 3, maxLength = 100, example = "Example", description = "Client's name") @NotNull @Size(min = 3, max = 100) String name,
        @Schema(example = "example@gmail.com", description = "Client's email") @NotNull @Email String email,
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @Schema(example = "2024-12-15T10:00:00Z", description = "Client's birthday in ISO 8601 format") @NotNull @Past LocalDateTime birthday,
        @Schema(example = "12345678910", description = "Client's CPF without formatting") @NotNull @CPF String cpf) {
    public CreateClientDto(String name, String email, LocalDateTime birthday, String cpf) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.cpf = cpf;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public LocalDateTime birthday() {
        return birthday;
    }

    @Override
    public String cpf() {
        return cpf;
    }
}
