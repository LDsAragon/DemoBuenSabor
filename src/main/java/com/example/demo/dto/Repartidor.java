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
public class Repartidor extends Person{

  @Column(name = "pedidosEntregados", nullable = false)
  private String pedidosEntregados;

  @Column(name = "comisionMensual", nullable = false)
  private String comisionMensual;

  @Column(name = "pedidosRechazados", nullable = false)
  private String pedidosRechazados;

  @Column(name = "pedidoEnProceso", nullable = false)
  private String pedidoEnProceso;


}

