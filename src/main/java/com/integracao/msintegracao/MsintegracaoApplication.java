package com.integracao.msintegracao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsintegracaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsintegracaoApplication.class, args);
	}

}
