package ma.enset.microservicebestpractices.services;

import lombok.AllArgsConstructor;
import ma.enset.microservicebestpractices.dtos.ClientDTO;
import ma.enset.microservicebestpractices.entities.Client;
import ma.enset.microservicebestpractices.mappers.ClientMapper;
import ma.enset.microservicebestpractices.repositories.ClientRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ClientServiceImp implements ClientService{
    ClientRepository clientRepository;
    ClientMapper clientMapper;
    @Override
    public ClientDTO saveClient(ClientDTO client) {
        return clientMapper.from(clientRepository.save(clientMapper.from(client)));
    }

    @Override
    public ClientDTO findClientById(Long id) {
        return  clientMapper.from(clientRepository.findById(id).orElse(null));
    }

    @Override
    public List<ClientDTO> findAllClients() {
        return clientRepository.findAll().stream().map(clientMapper::from).collect(Collectors.toList());
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public ClientDTO updateClient(Long id, ClientDTO client) {
        return clientMapper.from(clientRepository.save(clientMapper.from(client)));
    }
}
