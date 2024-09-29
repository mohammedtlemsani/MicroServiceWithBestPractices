package ma.enset.microservicebestpractices.restcontrollers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.enset.microservicebestpractices.dtos.ClientDTO;
import ma.enset.microservicebestpractices.services.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class ClientRestController {
    private ClientService customerService;
    @GetMapping("/customers")
    public List<ClientDTO> listCustomers(){
        return customerService.findAllClients();
    }
}