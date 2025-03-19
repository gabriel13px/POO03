package teste;
import java.util.Scanner;

public class POO25 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Menor = 999, Maior = -999, Numero, Soma = 0;
        float Media;
        for(int contagem = 0; contagem < 10; contagem++){
            System.out.print("Digite um numero: ");
            Numero = Teclado.nextInt();
            if(Numero > Maior){
                Maior = Numero;
            }
            if(Numero <  Menor){
                Menor = Numero;
            }
            Soma = Soma + Numero;

        }
        Media = Soma / 10;
        System.out.printf("o Maior é %d\n o Menor é %d\n a Soma é %d\n a Media é %.1f\n",Maior,Menor,Soma,Media);
    }
}
