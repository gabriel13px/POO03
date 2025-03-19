package teste;

import java.util.Scanner;

public class POO28 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int Numero;
        System.out.print("Digite um numero: ");
        Numero = Teclado.nextInt();
        while(!(Numero >= 12&& Numero <=20)){
            System.out.print("\nNumero invalido, digite novamente: ");
            Numero = Teclado.nextInt();
        }
        System.out.printf("\nO numero digitado é %d\n",Numero);
    }
}
