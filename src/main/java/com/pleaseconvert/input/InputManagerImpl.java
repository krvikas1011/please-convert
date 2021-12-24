package com.pleaseconvert.input;

import com.pleaseconvert.conversion.ConversionDefinition;
import com.pleaseconvert.model.ConversionInput;

public class InputManagerImpl implements InputManager {
  @Override
  public ConversionInput getConversionInput(ConversionDefinition conversionDefinition) {
    return new ConversionInput();
  }
}
