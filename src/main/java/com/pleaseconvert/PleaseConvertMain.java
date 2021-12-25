package com.pleaseconvert;

import com.pleaseconvert.conversion.ConversionDefinition;
import com.pleaseconvert.conversion.ConversionDefinitionImpl;
import com.pleaseconvert.conversion.ConversionFactory;
import com.pleaseconvert.conversion.ConversionFactoryImpl;
import com.pleaseconvert.input.InputManager;
import com.pleaseconvert.input.InputManagerImpl;
import com.pleaseconvert.input.UserInputHandler;
import com.pleaseconvert.input.UserInputHandlerImpl;

public class PleaseConvertMain {
  public static void main(String[] args) {
    ConversionFactory conversionFactory = new ConversionFactoryImpl();
    ConversionDefinition conversionDefinition = new ConversionDefinitionImpl(conversionFactory);
    UserInputHandler userInputHandler = new UserInputHandlerImpl();
    InputManager inputManager = new InputManagerImpl(conversionDefinition, userInputHandler);
    System.out.println(inputManager.getConversionInput().toString());
  }
}
