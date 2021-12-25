package com.pleaseconvert.input;

import java.util.Scanner;

public class UserInputHandlerImpl implements UserInputHandler {
  @Override
  public void printInputRequest(String statement) {
    System.out.println(statement);
  }

  @Override
  public String takeInput(String inputName) {
    System.out.printf("Please choose %s\n Input: ", inputName);
    Scanner scanner = new Scanner(System.in);
    return scanner.next();
  }
}
