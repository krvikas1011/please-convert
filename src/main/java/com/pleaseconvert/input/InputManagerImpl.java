package com.pleaseconvert.input;

import com.pleaseconvert.conversion.ConversionDefinition;
import com.pleaseconvert.model.ConversionInput;

import java.util.List;
import java.util.Scanner;

public class InputManagerImpl implements InputManager {

  private final ConversionDefinition conversionDefinition;

  public InputManagerImpl(ConversionDefinition conversionDefinition) {
    this.conversionDefinition = conversionDefinition;
  }

  @Override
  public ConversionInput getConversionInput() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please choose the category to convert: ");
    List<String> supportedConversionCategoriesList =
        conversionDefinition.getAllSupportedConversionsCategories();
    for (String conversionCategory : supportedConversionCategoriesList) {
      System.out.println(conversionCategory);
    }
    String conversionCategoryInput = sc.next();
    if (!supportedConversionCategoriesList.contains(conversionCategoryInput)) {
      System.out.println("Bad Input!");
      return new ConversionInput();
    }
    List<String> conversionForCategoryList =
        conversionDefinition.getConversionsForConversionsCategory(conversionCategoryInput);
    System.out.println("Please choose the " + conversionCategoryInput + " unit to convert: ");
    for (String conversionForCategory : conversionForCategoryList) {
      System.out.println(conversionForCategory);
    }
    String conversionForCategoryInput = sc.next();
    if (!conversionForCategoryList.contains(conversionForCategoryInput)) {
      System.out.println("Bad Input!");
      return new ConversionInput();
    }
    System.out.println("Please enter the value to convert: ");
    String input = sc.next();
    return new ConversionInput(conversionCategoryInput, conversionForCategoryInput, input);
  }
}
