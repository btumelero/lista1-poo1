package exercício.pkg13;

import java.util.Scanner;

public class Exercício13 {
  public static void main(String[] args) {
    int i;
    char letra;
    char[] palavra= new char[50];
    String continuar;
    System.out.println("Informe a palavra letra por letra:");
    Scanner scan = new Scanner(System.in);
    for (i=0; i<50; i++){
      palavra[i] = scan.next().charAt(0);
      System.out.println("Continuar? sim/nao");
      continuar = scan.next();
      if ("nao".equals(continuar)){
        break;
      }
    }
    
  }
  
}
