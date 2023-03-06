package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Objects;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Pedido {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "fechaCreacion", nullable = false)
  private Instant fechaCreacion ;
  @Column(name = "estado", nullable = false)
  private Integer estado ;
  @Column(name = "horaEstimadaFin", nullable = false)
  private Instant horaEstimadaFin ;
  @Column(name = "tipoEnvio", nullable = false)
  private Integer tipoEnvio ;
  @Column(name = "total", nullable = false)
  private BigDecimal total ;

  @OneToOne
  @JoinColumn(name = "mercadoPagoDatos_id")
  private MercadoPagoDatos mercadoPagoDatos ;

  @OneToOne
  @JoinColumn(name = "factura_id")
  private Factura factura;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Pedido pedido = (Pedido) o;
    return id != null && Objects.equals(id, pedido.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
