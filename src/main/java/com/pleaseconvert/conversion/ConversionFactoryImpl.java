package com.pleaseconvert.conversion;

import com.pleaseconvert.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConversionFactoryImpl implements ConversionFactory {

  @Override
  public List<String> getAllConversionsForConversionCategory(String conversionCategoryName) {
    ConversionCategory conversionCategory = ConversionCategory.findByName(conversionCategoryName);
    List<String> conversions = new ArrayList<>();
    switch (conversionCategory) {
      case CURRENCY:
        conversions =
            Arrays.stream(CurrencyConversion.values())
                .map(CurrencyConversion::getName)
                .collect(Collectors.toList());
        break;
      case TEMPERATURE:
        conversions =
            Arrays.stream(TemperatureConversion.values())
                .map(TemperatureConversion::getName)
                .collect(Collectors.toList());
        break;
      case TIME:
        conversions =
            Arrays.stream(WeightConversion.values())
                .map(WeightConversion::getName)
                .collect(Collectors.toList());
        break;
      case WEIGHT:
        conversions =
            Arrays.stream(TimeConversion.values())
                .map(TimeConversion::getName)
                .collect(Collectors.toList());
        break;
      case DISTANCE:
        conversions =
            Arrays.stream(DistanceConversion.values())
                .map(DistanceConversion::getName)
                .collect(Collectors.toList());
        break;
    }
    return conversions;
  }
}
