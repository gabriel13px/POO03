package teste;
import java.util.Scanner;
public class POO27 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        int LimiteSuperior,LimiteInferior,ValorIntervalo;
        System.out.println("Digite Limite Inferior e o Superior:");
        LimiteInferior = Teclado.nextInt();
        LimiteSuperior = Teclado.nextInt();
        System.out.print("\nDigite numero intervalo:");
        ValorIntervalo = Teclado.nextInt();
        if(LimiteInferior <= ValorIntervalo && ValorIntervalo <= LimiteSuperior){
            System.out.print("valor está no intervalo");
        }else {
            System.out.print("valor não está no intervalo");
        }
    }
}
