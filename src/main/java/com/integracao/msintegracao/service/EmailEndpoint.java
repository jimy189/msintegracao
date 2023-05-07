package com.integracao.msintegracao.service;

import com.integracao.msintegracao.dto.Email;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

@FeignClient(name = "email", url ="http://localhost:8080/ms-email")
public interface EmailEndpoint {

    @GetMapping("/emails")
    ResponseEntity<List<Email>> getAllEmails();

    @GetMapping("/emails/{emailId}")
    ResponseEntity<Object> getOneEmail(@PathVariable(value = "emailId") UUID emailId);

    @PostMapping("/sending-email")
    ResponseEntity<Object> saveCliente(@RequestBody Email email);

}
