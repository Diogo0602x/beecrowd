import java.util.Scanner;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int distanciaFornecida = scanner.nextInt();

    int distancia = distanciaFornecida * 2;

    System.out.println(distancia + " minutos");
  }
}