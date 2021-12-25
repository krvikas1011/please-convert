package com.pleaseconvert.model;

public enum CurrencyConversion {
  USD_TO_INR("USD_TO_INR"),
  INR_TO_USD("INR_TO_USD"),
  USD_TO_POUND("USD_TO_POUND"),
  POUND_TO_USD("POUND_TO_USD"),
  POUND_TO_INR("POUND_TO_INR"),
  INR_TO_POUND("INR_TO_POUND");

  private final String name;

  CurrencyConversion(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
