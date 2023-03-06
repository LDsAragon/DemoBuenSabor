package com.example.demo.Controller;

import com.example.demo.dto.Configuraciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
public class Controller {

  private final Configuraciones configuraciones;

  @Autowired
  public Controller(Configuraciones configuraciones) {
    this.configuraciones = configuraciones;
  }


  @GetMapping(value= "alive")
  public String alive(){
    return "Alive :D" ;
  }

  @GetMapping(value= "configs")
  public String configs(){
    return
        "Email: " + configuraciones.getEmail() +
        "Token: " + configuraciones.getToken();
  }

}
