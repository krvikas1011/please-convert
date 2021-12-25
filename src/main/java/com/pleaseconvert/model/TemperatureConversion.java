package com.pleaseconvert.model;

public enum TemperatureConversion {
  C_TO_F("C_TO_F"),
  F_TO_C("F_TO_C");

  private final String name;

  TemperatureConversion(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
