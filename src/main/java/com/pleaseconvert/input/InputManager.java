package com.pleaseconvert.input;

import com.pleaseconvert.conversion.ConversionDefinition;
import com.pleaseconvert.model.ConversionInput;

public interface InputManager {
  ConversionInput getConversionInput(ConversionDefinition conversionDefinition);
}
