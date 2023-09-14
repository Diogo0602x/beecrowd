import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    
    double pi = 3.14159;
    int raio = scanner.nextInt();
    
    double volume = (4/3.0) * (pi * Math.pow(raio,3)); 

    String volumeFormatado = String.format("%.3f", volume);
    
    System.out.println("VOLUME = " + volumeFormatado);
  }
}