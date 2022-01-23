import java.util.Scanner;

public class Reader {

  static Scanner scanner = new Scanner(System.in);

  public static double getDouble() {
    System.out.println("Введите число:");
    double num;
    if (scanner.hasNextDouble()) {
      num = scanner.nextDouble();
    } else {
      System.out.println("Проверьте вводимое значение.");
      scanner.next();
      num = getDouble();
    }
    return num;
  }

  public static char getOperation() {
    System.out.println("Введите операцию:");
    char operation;
    if (scanner.hasNext()) {
      operation = scanner.next().charAt(0);
    } else {
      System.out.println("Проверьте вводимую операцию.");
      scanner.next();
      operation = getOperation();
    }
    return operation;
  }
}
