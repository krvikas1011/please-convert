package com.pleaseconvert.conversion;

import java.util.List;

public interface ConversionFactory {
  List<String> getAllConversionsForConversionCategory(String conversionCategory);
}
