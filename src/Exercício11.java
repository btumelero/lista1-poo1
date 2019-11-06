package exercício.pkg11;
import java.util.Arrays;
import java.util.Scanner;
public class Exercício11 {
  public static void main(String[] args) {
    int i;
    char[] nome1= new char[50];
    char[] jean = {'j','e','a','n'};
    boolean igual;
    String continuar;
    System.out.println("Informe seu nome letra por letra:");
    Scanner scan = new Scanner(System.in);
    for (i=0; i<50; i++){
      nome1[i] = scan.next().charAt(0);
      System.out.println("Continuar? sim/nao");
      continuar = scan.next();
      if ("nao".equals(continuar)){
        break;
      }
    }
    char[] nome2= new char[i+1];
    for (int a=0; a<=i; a++){
      nome2[a]=nome1[a];
    }
    igual = Arrays.equals(nome2, jean);
    System.out.println("Nomes iguais? " + igual);
  }
  
}
