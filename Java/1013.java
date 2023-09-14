import java.util.Scanner;
import java.lang.Math;

public class Main {

  public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);
    
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();

    int maiorAb = ((A + B) + Math.abs(A-B))/2;
    int maiorXc = ((C + maiorAb) + Math.abs(C - maiorAb))/2;
    
    System.out.println(maiorXc + " eh o maior");
  }
}