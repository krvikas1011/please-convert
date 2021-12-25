package com.pleaseconvert.model;

import java.util.Arrays;
import java.util.Optional;

public enum ConversionCategory {
  CURRENCY("CURRENCY"),
  DISTANCE("DISTANCE"),
  WEIGHT("WEIGHT"),
  TEMPERATURE("TEMPERATURE"),
  TIME("TIME");

  private final String name;

  public String getName() {
    return name;
  }

  public static ConversionCategory findByName(String name) {
    return Arrays.stream(ConversionCategory.values())
        .filter(conversionFactory -> conversionFactory.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElse(null);
  }

  ConversionCategory(String name) {
    this.name = name;
  }
}
