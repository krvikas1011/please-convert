package com.pleaseconvert.model;

public enum DistanceConversion {
  MILES_TO_KMS("MILES_TO_KMS"),
  KMS_TO_MILES("KMS_TO_MILES"),
  INCHES_TO_CMS("INCHES_TO_CMS"),
  CMS_TO_INCHES("CMS_TO_INCHES");

  private final String name;

  DistanceConversion(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
