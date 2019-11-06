package exercício.pkg10;
import java.util.Scanner;
public class Exercício10 {
  public static void main(String[] args) {
    char letra;
    int n;
    System.out.println("Informe uma letra e um número:");
    Scanner scan = new Scanner(System.in);
    letra = scan.next().charAt(0);
    n = scan.nextInt();
    if (letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
      System.out.println("É uma vogal");
      for (int i=0; i<n; i++){
        System.out.print(letra + " ");
      }
    } else {
      System.out.println("Não é uma vogal");
    }
  }
  
}
