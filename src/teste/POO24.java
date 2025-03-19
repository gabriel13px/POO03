package teste;

import java.util.Scanner;

public class POO24 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int QuantNumeros = 3, Maior = 0, Menor = 0, Numero;
        int[] Numeros = new int[QuantNumeros];
        System.out.print("Digite um número: ");
        Numeros[0] = Teclado.nextInt();
         Maior = Numeros[0];
         Menor = Numeros[0];
        for (int contagem = 1; contagem < QuantNumeros; contagem++) {
            System.out.print("Digite um número: ");
            Numeros[contagem] = Teclado.nextInt();
            if (Numeros[contagem] > Maior) {
                Maior = Numeros[contagem];
            }
            if (Numeros[contagem] < Menor) {
                Menor = Numeros[contagem];
            }

        }
        System.out.printf("o Maior numero é %d e o Menor é %d", Maior, Menor);
    }
}
