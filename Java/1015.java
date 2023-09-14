import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    
    double x1 = scanner.nextDouble();
    double y1 = scanner.nextDouble();
    double x2 = scanner.nextDouble();
    double y2 = scanner.nextDouble();
    
    double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

    String distanciaFormatada = String.format("%.4f", distancia);

    System.out.println(distanciaFormatada);
  }
}