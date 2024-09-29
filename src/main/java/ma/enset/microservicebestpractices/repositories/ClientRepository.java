package ma.enset.microservicebestpractices.repositories;


import ma.enset.microservicebestpractices.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
