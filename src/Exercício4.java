package exercício4;
import java.util.Scanner;
public class Exercício4 {
  public static void main(String[] args) {
    char letra;
    Scanner scan = new Scanner(System.in);
    do {
      System.out.println("Para sair, digite 'x':");
      letra = scan.next().charAt(0);
    } while(letra!='x');
  }
  
}
