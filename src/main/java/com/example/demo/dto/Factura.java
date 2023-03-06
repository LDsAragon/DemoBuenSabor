package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Objects;
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
public class Factura {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "fechaCreacion", nullable = false)
  private Instant fechaCreacion;
  @Column(name = "numero", nullable = false)
  private String numero;
  @Column(name = "montoDescuento", nullable = false)
  private BigDecimal montoDescuento ;
  @Column(name = "formaDePago", nullable = false)
  private FormaDePago  formaDePago;
  @Column(name = "nroTarjeta", nullable = false)
  private String nroTarjeta ;
  @Column(name = "totalVenta", nullable = false)
  private String totalVenta ;

  @OneToMany(mappedBy = "factura")
  private List<DetalleFactura> detalles ;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Factura factura = (Factura) o;
    return id != null && Objects.equals(id, factura.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
