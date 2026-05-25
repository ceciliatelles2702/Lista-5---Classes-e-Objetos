
import harrypotter.HarryPotter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cecil
 */
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        while (opcao != 0) {

            System.out.print("Nome do aluno: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());

            System.out.print("Coragem: ");
            int coragem = Integer.parseInt(sc.nextLine());

            System.out.print("Inteligencia: ");
            int inteligencia = Integer.parseInt(sc.nextLine());

            System.out.print("Ambicao: ");
            int ambicao = Integer.parseInt(sc.nextLine());

            System.out.print("Lealdade: ");
            int lealdade = Integer.parseInt(sc.nextLine());

            System.out.print("Estrategia: ");
            int estrategia = Integer.parseInt(sc.nextLine());

            System.out.print("Criatividade: ");
            int criatividade = Integer.parseInt(sc.nextLine());

            HarryPotter aluno = new HarryPotter(
                    nome,
                    idade,
                    coragem,
                    inteligencia,
                    ambicao,
                    lealdade,
                    estrategia,
                    criatividade
            );

            aluno.calcularCasa();

            aluno.exibirInformacoes();

            System.out.println("\nDigite 0 para sair");
            System.out.println("Digite qualquer outro numero para continuar");

            opcao = Integer.parseInt(sc.nextLine());
        }
    }
}