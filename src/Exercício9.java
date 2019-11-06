package exercício.pkg9;
import java.util.Scanner;
public class Exercício9 {
  public static void main(String[] args) {
    double salario, contribuicao;
    System.out.println("Informe seu salário:");
    Scanner scan = new Scanner(System.in);
    salario = scan.nextDouble();
    contribuicao = salario;
    if (salario<=1556.94){
      contribuicao = contribuicao * 0.08;
    }
    if (salario>=1556.95 && salario<=2594.92){
      contribuicao = contribuicao * 0.09;
    }
    if (salario>2594.93){
      contribuicao = contribuicao * 0.11;
    }
    System.out.println("A sua contribuição mensal é de: " + contribuicao);
  }
  
}
