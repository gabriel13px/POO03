package teste;

import java.util.Scanner;

public class teste03 {
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        int QntAlunos = 3, QntNotas = 4;

        float PlanilhaNotas[][] = new float[QntAlunos][QntNotas];

        System.out.println("Informe as notas!\n");

        //Aluno = Teclado.nextLine();

        for(int Nota = 0; Nota < (QntNotas-2); Nota++) { // cuidado com a pergunta do indice = posição-1

            for(int Aluno = 0; Aluno < QntAlunos; Aluno++) {

                System.out.printf("Aluno %d Nota %d: ", Aluno+1, Nota+1);

                PlanilhaNotas[Aluno][Nota] = Teclado.nextInt();

            }

        }



        for(int Aluno = 0; Aluno < QntAlunos; Aluno++) {

            PlanilhaNotas[Aluno][3] = (PlanilhaNotas[Aluno][0]+PlanilhaNotas[Aluno][1])/2;

            if(PlanilhaNotas[Aluno][3] >= 6){

                System.out.printf("\nAluno %d Nota Av3", Aluno+1);

                PlanilhaNotas[Aluno][2] = Teclado.nextInt();

                PlanilhaNotas[Aluno][3] = (PlanilhaNotas[Aluno][3] + PlanilhaNotas[Aluno][2])/2;

                if(PlanilhaNotas[Aluno][3] >= 5){

                    System.out.printf("\nAluno %d aprovado com sucesso!\n", Aluno+1);

                }else{

                    System.out.printf("\nAluno %d reprovado!\n", Aluno+1);

                }

            }else{

               System.out.printf("\nAluno %d reprovado!\n", Aluno+1);

            }

        }





    }
}
