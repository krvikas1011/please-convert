package com.pleaseconvert.input;

import com.pleaseconvert.conversion.ConversionDefinition;
import com.pleaseconvert.model.ConversionInput;

import java.util.List;
import java.util.Scanner;

public class InputManagerImpl implements InputManager {

  private final ConversionDefinition conversionDefinition;
  private final UserInputHandler userInputHandler;

  public InputManagerImpl(
      ConversionDefinition conversionDefinition, UserInputHandler userInputHandler) {
    this.conversionDefinition = conversionDefinition;
    this.userInputHandler = userInputHandler;
  }

  @Override
  public ConversionInput getConversionInput() {
    Scanner sc = new Scanner(System.in);
    userInputHandler.printInputRequest("Please choose the category");
    List<String> supportedConversionCategoriesList =
        conversionDefinition.getAllSupportedConversionsCategories();
    for (String conversionCategory : supportedConversionCategoriesList) {
      userInputHandler.printInputRequest(conversionCategory);
    }
    userInputHandler.printInputRequest("Input: ");
    String conversionCategoryInput = sc.next();
    if (!supportedConversionCategoriesList.contains(conversionCategoryInput)) {
      System.out.println("Bad Input!");
      return new ConversionInput();
    }
    List<String> conversionForCategoryList =
        conversionDefinition.getConversionsForConversionsCategory(conversionCategoryInput);
    userInputHandler.takeInput(conversionCategoryInput);
    for (String conversionForCategory : conversionForCategoryList) {
      userInputHandler.printInputRequest(conversionForCategory);
    }
    String conversionForCategoryInput = sc.next();
    if (!conversionForCategoryList.contains(conversionForCategoryInput)) {
      System.out.println("Bad Input!");
      return new ConversionInput();
    }
    userInputHandler.printInputRequest("Please enter the value: ");
    String input = sc.next();
    return new ConversionInput(conversionCategoryInput, conversionForCategoryInput, input);
  }
}
