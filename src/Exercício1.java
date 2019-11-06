package exercício.pkg1;
import java.util.Scanner;
public class Exercício1 {
    public static void main(String[] args) {
        float largura, altura, profundidade, volume;
        System.out.println("escreva a largura, altura e profundidade em cm");
        Scanner scan= new Scanner (System.in);
        largura=scan.nextFloat();
        altura=scan.nextFloat();
        profundidade=scan.nextFloat();
        volume=largura*altura*profundidade;
        System.out.println("O volume do Paralelepípedo é: " + volume + "cm3");
    }
    
}
