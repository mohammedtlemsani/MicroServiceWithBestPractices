package ma.enset.microservicebestpractices.mappers;

import ma.enset.microservicebestpractices.dtos.ClientDTO;
import ma.enset.microservicebestpractices.entities.Client;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class ClientMapper {
    private ModelMapper modelMapper=new ModelMapper();
    public ClientDTO from(Client client){
            return modelMapper.map(client,ClientDTO.class);
        }
    public Client from(ClientDTO customerDTO){
            return modelMapper.map(customerDTO,Client.class);
        }

}
