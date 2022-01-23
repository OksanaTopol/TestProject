public class Main {

  public static void main(String[] args) {
    double num1 = Reader.getDouble();
    double num2 = Reader.getDouble();
    char operation = Reader.getOperation();
    double result = Calculator.calc(num1, num2, operation);
    System.out.println("Результат операции: " + result);
  }
}
