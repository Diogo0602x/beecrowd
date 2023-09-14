import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    
    int X = scanner.nextInt();
    double Y = scanner.nextDouble();

    double consumoMedio = X/Y;

    String consumoMedioFormatado = String.format("%.3f", consumoMedio);

    System.out.println(consumoMedioFormatado + " km/l");
  }
}