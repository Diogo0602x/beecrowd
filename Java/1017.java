import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    int tempoGasto = scanner.nextInt();
    int velocidadeMedia = scanner.nextInt();
    double mediaKmPorL = 12.0;
    double quantidadeLitrosViagem = (tempoGasto * velocidadeMedia) / mediaKmPorL;
    
    System.out.printf("%.3f%n", quantidadeLitrosViagem);
  }
}