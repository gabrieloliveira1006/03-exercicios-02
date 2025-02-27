package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador  jogador = new Jogador();

        //entrada de dados
        System.out.println("Nome: ");
        jogador.nome = sc.nextLine();
        for (int i = 0; i < jogador.score.length; i++) {
            System.out.println("Score "+ (i+1) + ": ");
            jogador.score[i] = sc.nextInt();
        }

        //saída de dados
        System.out.println();
        System.out.println("Nome: "+ jogador.nome);
        System.out.println("Score total: "+ jogador.calcularScoreTotal());
        System.out.println("Rodada 1: "+ jogador.score[0]);
        System.out.println("Rodada 2: "+ jogador.score[1]);
        System.out.println("Rodada 3: "+ jogador.score[2]);
    }
}
