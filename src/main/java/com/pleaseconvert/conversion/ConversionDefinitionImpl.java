package com.pleaseconvert.conversion;

import com.pleaseconvert.model.ConversionCategory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConversionDefinitionImpl implements ConversionDefinition {

  @Override
  public List<String> getAllSupportedConversionsCategories() {
    return Arrays.stream(ConversionCategory.values())
        .map(ConversionCategory::getName)
        .collect(Collectors.toList());
  }

  @Override
  public List<String> getConversionsForConversionsCategory(String conversionCategory) {
    return null;
  }
}
