package com.pleaseconvert.model;

public enum ConversionCategories {
  CURRENCY("currency"),
  DISTANCE("distance"),
  WEIGHT("weight"),
  TEMPERATURE("temperature"),
  TIME("time");

  private final String name;

  public String getName() {
    return name;
  }

  ConversionCategories(String name) {
    this.name = name;
  }
}
