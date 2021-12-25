package com.pleaseconvert.model;

import java.util.Arrays;

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

  public static TemperatureConversion findByName(String name) {
    return Arrays.stream(TemperatureConversion.values())
        .filter(temperatureConversion -> temperatureConversion.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElse(null);
  }
}
