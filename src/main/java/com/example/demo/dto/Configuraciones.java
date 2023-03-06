package com.example.demo.dto;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Configuraciones {

  public Configuraciones(){}

  @Value("${config.email.Empresa}")
  private String email;

  @Value("${config.token.MercadoPago}")
  private String token;

}
