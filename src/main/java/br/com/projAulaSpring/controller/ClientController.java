package br.com.projAulaSpring.controller;

import br.com.projAulaSpring.constant.Constant;
import br.com.projAulaSpring.model.Client;
import br.com.projAulaSpring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(Constant.URL_CLIENT)
    public void insert (@RequestBody Client client){
        clientService.saveRabbit(client);
    }

    @GetMapping(Constant.URL_CLIENT)
    public List<Client> findAll(){
        return clientService.findAll();
    }
}
