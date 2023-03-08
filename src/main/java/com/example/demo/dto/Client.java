package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Client extends Person{

  @Column(name = "nombreUsuario", nullable = false)
  private String nombreUsuario;

  @Column(name = "email", nullable = false)
  private String email;

  @Column(name = "password", nullable = false)
  private String password;

  @Column(name = "fechaBaja", nullable = false)
  private String fechaBaja;

  @Column(name = "historialPedidos", nullable = false)
  private String historialPedidos;

  @Column(name = "pedidosRechazados", nullable = false)
  private String pedidosRechazados;

  @OneToOne
  @JoinColumn(name = "direccion_id")
  private Direccion direccion ;


}

