package com.pleaseconvert.input;

import com.pleaseconvert.conversion.ConversionDefinition;
import com.pleaseconvert.model.ConversionInput;

import java.util.List;
import java.util.Scanner;

public class InputManagerImpl implements InputManager {
  @Override
  public ConversionInput getConversionInput(ConversionDefinition conversionDefinition) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please choose the category to convert: ");
    List<String> supportedConversionCategoriesList =
        conversionDefinition.getAllSupportedConversionsCategories();
    for (String conversionCategory : supportedConversionCategoriesList) {
      System.out.println(conversionCategory);
    }
    String conversionCategoryInput = sc.next();
    List<String> conversionForCategoryList =
        conversionDefinition.getConversionsForConversionsCategory(conversionCategoryInput);
    System.out.println("Please choose the " + conversionCategoryInput + " unit to convert: ");
    for (String conversionForCategory : conversionForCategoryList) {
      System.out.println(conversionForCategory);
    }
    String conversionForCategoryInput = sc.next();
    System.out.println("Please enter the value to convert: ");
    String input = sc.next();
    ConversionInput conversionInput =
        new ConversionInput(conversionCategoryInput, conversionForCategoryInput, input);
    return conversionInput;
  }
}
