package com.pleaseconvert.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConversionInput {
  String conversionCategory;
  String conversion;
  String input;

  @Override
  public String toString() {
    return "ConversionInput{"
        + "conversionCategory='"
        + conversionCategory
        + '\''
        + ", conversion='"
        + conversion
        + '\''
        + ", input='"
        + input
        + '\''
        + '}';
  }
}
