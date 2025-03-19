package teste;

import java.util.Scanner;

public class POO26 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int Numero, Divisores = 0;
        System.out.print("Digite um numero: ");
        Numero = teclado.nextInt();
        for(int contagem = 1; contagem <= Numero; contagem++){
            if(Numero % contagem == 0){
                Divisores++;
            }
        }
        if(Divisores <=2){
            System.out.printf("o valor é primo");
        }else{
            System.out.printf("o valor não é primo");
        }
    }
}
