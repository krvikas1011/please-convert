package com.pleaseconvert;

import com.pleaseconvert.conversion.ConversionDefinition;
import com.pleaseconvert.conversion.ConversionDefinitionImpl;
import com.pleaseconvert.conversion.ConversionFactory;
import com.pleaseconvert.conversion.ConversionFactoryImpl;
import com.pleaseconvert.input.InputManager;
import com.pleaseconvert.input.InputManagerImpl;

public class PleaseConvertMain {
  public static void main(String[] args) {
    ConversionFactory conversionFactory = new ConversionFactoryImpl();
    ConversionDefinition conversionDefinition = new ConversionDefinitionImpl(conversionFactory);
    InputManager inputManager = new InputManagerImpl(conversionDefinition);
    System.out.println(inputManager.getConversionInput().toString());
  }
}
