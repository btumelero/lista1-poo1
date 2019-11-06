package exercício3;
import java.util.Scanner;
public class Exercício3 {
  public static void main(String[] args) {
    double temperatura;
    System.out.println("Informe uma temperatura:");
    Scanner scan = new Scanner(System.in);
    temperatura = scan.nextDouble();
    if (temperatura>0){
      System.out.println("A temperatura é positiva.");
    }
    if (temperatura<0){
      System.out.println("A temperatura é negativa.");
    }
    if (temperatura==0){
      System.out.println("A temperatura é zero.");
    }
  }
  
}
