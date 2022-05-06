package br.com.projAulaSpring.service;

import br.com.projAulaSpring.model.Client;
import br.com.projAulaSpring.rabbit.ClientProducer;
import br.com.projAulaSpring.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientProducer clientProducer;

    public void save (Client client){
        clientRepository.save(client);
    }

    public void saveRabbit (Client client){
        clientProducer.send(client);
    }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }
}
