package com.it_academy.calculator;
import main.java.com.it_academy.calculator.Reader;

import java.util.Scanner;

public class Calculator {

  public static double calc(double num1, double num2, char operation) {
    double result;
    switch (operation) {
      case '+':
        result = sum(num1, num2);
        break;
      case '-':
        result = minus(num1, num2);
        break;
      case '*':
        result = multiply(num1, num2);
        break;
      case '/':
        result = divide(num1, num2);
        break;
      default:
        System.out.println("Проверьте вводимую операцию.");
        result = calc(num1, num2, Reader.getOperation());
    }
    return result;
  }

  public static double sum(double num1, double num2) {
    return num1 + num2;
  }

  public static double minus(double num1, double num2) {
    return num1 - num2;
  }

  public static double multiply(double num1, double num2) {
    return num1 * num2;
  }

  public static double divide(double num1, double num2) {
    return num1 / num2;
  }
}