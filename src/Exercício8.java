package exercício.pkg8;

import java.util.Scanner;

public class Exercício8 {
  public static void main(String[] args) {
    int a, b;
    System.out.println("Informe uma base e um expoente:");
    Scanner scan = new Scanner(System.in);
    a = scan.nextInt();
    b = scan.nextInt();
    if(b==0){
      a=0;
    }
    else{
      for (int i=1; i<b; i++){
        a = a*a;
      }
    }
    System.out.println("'a' elevado a 'b' é igual a:" + a);
  }
  
}
