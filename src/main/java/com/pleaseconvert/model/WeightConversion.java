package com.pleaseconvert.model;

import java.util.Arrays;

public enum WeightConversion {
  LBS_TO_KGS("LBS_TO_KGS"),
  KGS_TO_LBS("KGS_TO_LBS");

  private final String name;

  WeightConversion(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static WeightConversion findByName(String name) {
    return Arrays.stream(WeightConversion.values())
        .filter(weightConversion -> weightConversion.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElse(null);
  }
}
