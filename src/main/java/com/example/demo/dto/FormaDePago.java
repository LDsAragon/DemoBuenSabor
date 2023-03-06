package com.example.demo.dto;

import lombok.Getter;

@Getter
public enum FormaDePago {

  EFECTIVO(0),
  MERCADO_PAGO(1) ;

  private final int value;

  FormaDePago(int value) {
    this.value=value;
  }

  public int getValue() {
    return value;
  }

}
