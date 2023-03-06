package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Objects;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Table;


@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Domicilio {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "calle", nullable = false)
  private String calle;

  @Column(name = "localidad", nullable = false)
  private String localidad;

  @Column(name = "numero", nullable = false)
  private Integer numero;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Domicilio domicilio = (Domicilio) o;
    return id != null && Objects.equals(id, domicilio.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}
