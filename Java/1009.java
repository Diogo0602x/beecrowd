import java.util.Scanner;

public class 1009 {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);

    String nome = scanner.next();
    double salarioFixo = scanner.nextDouble();
    double totalVendas = scanner.nextDouble();

    double salarioTotal = salarioFixo + (totalVendas * 0.15);
    
    String salarioTotalFormatado = String.format("%.2f", salarioTotal);

    System.out.println("TOTAL = R$ " + salarioTotalFormatado);
  }
}