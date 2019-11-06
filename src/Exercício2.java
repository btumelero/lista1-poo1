package exercício2;
import java.util.Scanner;
public class Exercício2 {
  public static void main(String[] args) {
    double velocidade;
    System.out.println("Informe a velocidade em KM/H:");
    Scanner scan = new Scanner (System.in);
    velocidade = scan.nextDouble();
    velocidade = velocidade / 3.6;
    System.out.println("A velocidade informada convertida para M/S é: " + velocidade);
  }
  
}
