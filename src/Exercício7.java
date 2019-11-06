package exercício7;
import java.util.Scanner;
public class Exercício7 {
  public static void main(String[] args) {
    double temperatura;
    System.out.println("Informe uma temperatura:");
    Scanner scan = new Scanner(System.in);
    temperatura = scan.nextDouble();
    if (temperatura<20){
      System.out.println("Hipotermia");
    }
    if (temperatura>=20 && temperatura<=37.5){
      System.out.println("Temperatura Normal");
    }
    if (temperatura>37.5 && temperatura<=42){
      System.out.println("Febre");
    }
    if (temperatura>42) {
      System.out.println("Perigo");
    }
  }
  
}
