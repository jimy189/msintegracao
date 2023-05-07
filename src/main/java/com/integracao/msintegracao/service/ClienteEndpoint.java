package com.integracao.msintegracao.service;
import com.integracao.msintegracao.dto.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "cliente", url ="http://localhost:8080/cliente")
public interface ClienteEndpoint {

    @GetMapping("/{id}")
    ResponseEntity<Cliente> getCliente(@PathVariable(value = "id") Integer id);

    @PutMapping("/{id}")
    ResponseEntity<Cliente> updateCliente(@PathVariable(value = "id") Integer id,  @RequestBody  Cliente cliente);

    @PostMapping
    ResponseEntity<Object> saveCliente(@RequestBody Cliente cliente);

}
