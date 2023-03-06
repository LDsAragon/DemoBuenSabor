package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "nombreUsuario", nullable = false)
  private String nombreUsuario;

  @Column(name = "clave", nullable = false)
  private String clave;

  @Column(name = "nombre", nullable = false)
  private String nombre;

  @Column(name = "apellido", nullable = false)
  private String apellido;

  @Column(name = "telefono", nullable = false)
  private Long  telefono;

  @Column(name = "email", nullable = false)
  private String email;

  @OneToOne
  @JoinColumn(name = "domicilio_id")
  private Domicilio domicilio ;


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) {
      return false;
    }
    Usuario usuario = (Usuario) o;
    return id != null && Objects.equals(id, usuario.id);
  }

  @Override
  public int hashCode() {
    return getClass().hashCode();
  }
}

