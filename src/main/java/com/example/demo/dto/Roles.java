package com.example.demo.dto;

import lombok.Getter;

@Getter
public enum Roles {

  USER(0),
  ADMIN(1),
  DELIVERY(2),
  CHEF(3);

  private final int value;

  Roles(int value) {
    this.value=value;
  }

  public int getValue() {
    return value;
  }

}
