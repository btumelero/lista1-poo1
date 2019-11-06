package exercício.pkg12;
import java.util.Scanner;
public class Exercício12 {
  public static void main(String[] args) {
    int n1, n2, n3, tentativas=0;
    boolean liberado=false;
    Scanner scan = new Scanner(System.in);
    do{
      n1 = scan.nextInt();
      n2 = scan.nextInt();
      n3 = scan.nextInt();
      if (n1==1 && n2==2 && n3==3){
        System.out.println("liberado");
        liberado=true;
      }
      tentativas++;
    } while (liberado==false && tentativas <=3);
    if(liberado==false){
      System.out.println("Bloqueado");
    }
  }
  
}
