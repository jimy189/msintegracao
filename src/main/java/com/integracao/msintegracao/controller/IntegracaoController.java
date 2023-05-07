package com.integracao.msintegracao.controller;

import com.integracao.msintegracao.dto.Cliente;
import com.integracao.msintegracao.dto.Email;
import com.integracao.msintegracao.service.ClienteEndpoint;
import com.integracao.msintegracao.service.EmailEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/integracao")
public class IntegracaoController {

    @Autowired
    ClienteEndpoint clienteEndpoint;
    @Autowired
    EmailEndpoint emailEndpoint;

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getCliente(@PathVariable(value = "id") Integer id){
        return  clienteEndpoint.getCliente(id);
    }

    @PostMapping
    public ResponseEntity<Object> saveCliente(@RequestBody  Cliente cliente){
        return clienteEndpoint.saveCliente(cliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable(value = "id") Integer id,
                                                 @RequestBody  Cliente cliente){
        return clienteEndpoint.updateCliente(id, cliente);
    }


    @GetMapping("/emails")
    public ResponseEntity<List<Email>> getAllEmails(){
        return  emailEndpoint.getAllEmails();
    }

    @GetMapping("/emails/{emailId}")
    public ResponseEntity<Object> getOneEmail(@PathVariable(value = "emailId") UUID emailId){
        return emailEndpoint.getOneEmail(emailId);
    }

    @PostMapping("/sending-email")
    public ResponseEntity<Object> saveCliente(@RequestBody Email email){
        return emailEndpoint.saveCliente(email);
    }
}
