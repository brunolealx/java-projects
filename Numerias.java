import java.util.Scanner;
import java.text.DecimalFormat;

public class Numerais {

public static void main(String[] args) {
    
    Scanner ler = new Scanner(System.in);
    DecimalFormat saida = new DecimalFormat("0.00000");
    
    double A=ler.nextDouble();
    double B=ler.nextDouble();
    double C=ler.nextDouble();
    double media;
    
    media= ((A*2)+(B*3)+(C*5))/(2+3+5);
    
    System.out.println("MEDIA = "+saida.format(media));
           
    
}

}
