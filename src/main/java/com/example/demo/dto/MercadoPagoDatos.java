package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class MercadoPagoDatos {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long identificadorPago;

  @Column(name = "fechaCreacion", nullable = false)
  private Instant fechaCreacion;
  @Column(name = "fechaAprobacion", nullable = false)
  private Instant fechaAprobacion;

  @Column(name = "formaPago", nullable = false)
  private String formaPago;
  @Column(name = "metodoPago", nullable = false)
  private String metodoPago;
  @Column(name = "nroTarjeta", nullable = false)
  private String nroTarjeta;
  @Column(name = "estado", nullable = false)
  private String estado;


}
