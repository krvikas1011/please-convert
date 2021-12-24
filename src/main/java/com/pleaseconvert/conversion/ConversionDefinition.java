package com.pleaseconvert.conversion;

import java.util.List;

public interface ConversionDefinition {
  List<String> getAllSupportedConversionsCategories();

  List<String> getConversionsForConversionsCategory(String conversionCategory);
}
