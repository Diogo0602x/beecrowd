import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    
    double pi = 3.14159;
    double A = scanner.nextDouble();
    double B = scanner.nextDouble();
    double C = scanner.nextDouble();

    double areaTriangulo = (A*C)/2;
    double areaCirculo = pi * Math.pow(C,2);
    double areaTrapezio = ((A+B) * C)/2;
    double areaQuadrado = Math.pow(B,2);
    double areaRetangulo = A * B;

    String areaTrianguloFormatada = String.format("%.3f", areaTriangulo);
    String areaCirculoFormatada = String.format("%.3f", areaCirculo);
    String areaTrapezioFormatada = String.format("%.3f", areaTrapezio);
    String areaQuadradoFormatada = String.format("%.3f", areaQuadrado);
    String areaRetanguloFormatada = String.format("%.3f", areaRetangulo);

    System.out.println("TRIANGULO: " + areaTrianguloFormatada);
    System.out.println("CIRCULO: " + areaCirculoFormatada);
    System.out.println("TRAPEZIO: " + areaTrapezioFormatada);
    System.out.println("QUADRADO: " + areaQuadradoFormatada);
    System.out.println("RETANGULO: " + areaRetanguloFormatada);

  }
}