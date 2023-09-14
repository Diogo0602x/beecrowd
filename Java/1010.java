import java.util.Scanner;

public class Main {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);

    int codigoPeca1 = scanner.nextInt();
    int qtdPeca1 = scanner.nextInt();
    double valorPeca1 = scanner.nextDouble();
    
    int codigoPeca2 = scanner.nextInt();
    int qtdPeca2 = scanner.nextInt();
    double valorPeca2 = scanner.nextDouble();
    
    double valorPagar = (qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2);

    String valorPagarFormatado = String.format("%.2f", valorPagar);
    
    System.out.println("VALOR A PAGAR: R$ " + valorPagarFormatado);
  }
}