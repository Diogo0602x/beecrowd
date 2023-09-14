import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
      double A = scanner.nextDouble();
      double B = scanner.nextDouble();
      
      double soma = (A * 3.5) + (B * 7.5);
      
      double media = soma/11;
      
      String mediaFormatada = String.format("%.5f", media);
      
      System.out.println("MEDIA = " + mediaFormatada);
    }
}