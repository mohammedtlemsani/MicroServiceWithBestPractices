package ma.enset.microservicebestpractices.services;

import ma.enset.microservicebestpractices.dtos.ClientDTO;
import ma.enset.microservicebestpractices.entities.Client;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {
    public ClientDTO saveClient(ClientDTO client);
    public ClientDTO findClientById(Long id);
    public List<ClientDTO> findAllClients();
    public void deleteClient(Long id);
    public ClientDTO updateClient(Long id, ClientDTO client);
}
