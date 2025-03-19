package teste;

import java.util.Scanner;

public class POO36 {
    public static void main(String[] args) {
        //sendo bem sincero eu não entendi oque ele queria
        Scanner teclado = new Scanner(System.in);
        int QuantPessoas = 2;
        int[] IdadesLida = new int[QuantPessoas];
        float[] AlturaLida = new float[QuantPessoas];
        int[] IdadesInversa = new int[QuantPessoas];
        float[] AlturaInversa = new float[QuantPessoas];
        for(int pessoa=0; pessoa<QuantPessoas; pessoa++) {
            System.out.printf("\nDigite a idade da pessoa %d: ",pessoa+1);
            IdadesLida[pessoa] = teclado.nextInt();
            System.out.printf("\nDigite a Altura da pessoa %d: ",pessoa+1);
            AlturaLida[pessoa] = teclado.nextFloat();
            IdadesInversa[QuantPessoas-1-pessoa] = IdadesLida[pessoa];
            AlturaInversa[QuantPessoas-1-pessoa] = AlturaLida[pessoa];
        }
        for(int pessoa=0; pessoa<QuantPessoas; pessoa++) {
            System.out.printf("\nA idade da pessoa %d é:%d anos",pessoa+1,IdadesInversa[pessoa]);
            System.out.printf("\nA altura da pessoa %d é:%.2f Metros",pessoa+1,AlturaInversa[pessoa]);
        }

    }
}
