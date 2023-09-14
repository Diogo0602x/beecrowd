import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double pi = 3.14159;
    double raio = scanner.nextDouble();
    double area = pi * raio * raio;

    String areaFormatada = String.format("%.4f", area);

    System.out.println("A=" + areaFormatada);
  }

}