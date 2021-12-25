package com.pleaseconvert.input;

public interface UserInputHandler {
  void printInputRequest(String statement);

  String takeInput(String inputName);
}
