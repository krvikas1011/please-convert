package com.pleaseconvert.model;

import java.util.Arrays;

public enum TimeConversion {
  IST_TO_UTC("IST_TO_UTC"),
  CST_TO_UTC("CST_TO_UTC"),
  GMT_TO_UTC("GMT_TO_UTC"),
  UTC_TO_IST("UTC_TO_IST"),
  UTC_TO_CST("UTC_TO_CST"),
  UTC_TO_GMT("UTC_TO_GMT");

  private final String name;

  TimeConversion(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static TimeConversion findByName(String name) {
    return Arrays.stream(TimeConversion.values())
        .filter(timeConversion -> timeConversion.getName().equalsIgnoreCase(name))
        .findFirst()
        .orElse(null);
  }
}
