import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int A = scanner.nextInt();
    int B = scanner.nextInt();
    double C = scanner.nextDouble();

    double salario = B * C;
    
    String salarioFormatado = String.format("%.2f", salario);

    System.out.println("NUMBER = " + A);
    System.out.println("SALARY = U$ " + salarioFormatado);
  }
}