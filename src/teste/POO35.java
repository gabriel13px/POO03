package teste;

import java.util.Scanner;

public class POO35 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int QuantNumeros = 5;
        int Multiplicacao = 1, Soma = 0;
        int[] Numeros = new int[QuantNumeros];
        for(int Numero = 0; Numero < QuantNumeros; Numero++){
            System.out.print("\nDigite um numero: ");
            Numeros[Numero] = teclado.nextInt();
            Soma = Soma + Numeros[Numero];
            Multiplicacao = Multiplicacao * Numeros[Numero];
        }
        System.out.printf("A Soma dos Numeros é: %d\nA Multiplicação dos Numeros é:%d",Soma,Multiplicacao);
    }
}
