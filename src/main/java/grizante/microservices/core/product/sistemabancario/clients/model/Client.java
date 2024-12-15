package grizante.microservices.core.product.sistemabancario.clients.model;

import grizante.microservices.core.product.sistemabancario.common.model.CommonEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity(name = "client")
public class Client extends CommonEntity {

    @Column(name = "name", unique = false, nullable = false)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "cpf", unique = true, nullable = false)
    private String cpf;

    @Column(name = "birth_date", unique = false, nullable = false)
    private LocalDateTime birthDate;

    public Client() {}

    @Override
    public Long getId() {
        return super.getId();
    }

    @Override
    public String getExternalId() {
        return super.getExternalId();
    }

    @Override
    public void setExternalId(String externalId) {
        super.setExternalId(externalId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }
}
