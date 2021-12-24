package com.pleaseconvert.conversion;

import com.pleaseconvert.model.Conversion;
import com.pleaseconvert.model.ConversionCategory;
import com.pleaseconvert.model.CurrencyConversions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConversionFactoryImpl implements ConversionFactory {

  @Override
  public List<String> getAllConversionsForConversionCategory(String conversionCategoryName) {
    ConversionCategory conversionCategory = ConversionCategory.findByName(conversionCategoryName);
    switch (conversionCategory) {
      case CURRENCY:
        return Arrays.stream(CurrencyConversions.values())
            .map(CurrencyConversions::getName)
            .collect(Collectors.toList());
      case TEMPERATURE:
        break;
      case TIME:
        break;
      case WEIGHT:
        break;
      case DISTANCE:
        break;
    }
  }
}
