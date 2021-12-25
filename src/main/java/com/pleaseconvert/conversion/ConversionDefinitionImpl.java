package com.pleaseconvert.conversion;

import com.pleaseconvert.model.ConversionCategory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConversionDefinitionImpl implements ConversionDefinition {

  private final ConversionFactory conversionFactory;

  public ConversionDefinitionImpl(ConversionFactory conversionFactory) {
    this.conversionFactory = conversionFactory;
  }

  @Override
  public List<String> getAllSupportedConversionsCategories() {
    return Arrays.stream(ConversionCategory.values())
        .map(ConversionCategory::getName)
        .collect(Collectors.toList());
  }

  @Override
  public List<String> getConversionsForConversionsCategory(String conversionCategory) {
    return conversionFactory.getAllConversionsForConversionCategory(conversionCategory);
  }
}
