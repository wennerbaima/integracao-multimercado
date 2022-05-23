package com.integracaomultimercado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class IntegracaoMultimercadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegracaoMultimercadoApplication.class, args);
	}

}
