/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package harrypotter;

/**
 *
 * @author cecil
 */
public class HarryPotter {

    /**
     * @param args the command line arguments
     */
   
    private String nome;
    private int idade;
    private int coragem;
    private int inteligencia;
    private int ambicao;
    private int lealdade;
    private int estrategia;
    private int criatividade;
    private String casa;

    public HarryPotter(String nome, int idade, int coragem, int inteligencia,
                       int ambicao, int lealdade, int estrategia, int criatividade) {

        this.nome = nome;
        this.idade = idade;
        this.coragem = coragem;
        this.inteligencia = inteligencia;
        this.ambicao = ambicao;
        this.lealdade = lealdade;
        this.estrategia = estrategia;
        this.criatividade = criatividade;
    }

    public void calcularCasa() {

        int grifinoria = (2 * coragem) + lealdade;
        int sonserina = (2 * ambicao) + estrategia;
        int corvinal = (2 * inteligencia) + criatividade;
        int lufalufa = ((2 * lealdade) + coragem) / 3;

        int maior = grifinoria;
        casa = "Grifinoria";

        if (sonserina > maior) {
            maior = sonserina;
            casa = "Sonserina";
        }

        if (corvinal > maior) {
            maior = corvinal;
            casa = "Corvinal";
        }

        if (lufalufa > maior) {
            maior = lufalufa;
            casa = "Lufa-Lufa";
        }
    }

    public void exibirInformacoes() {

        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Casa: " + casa);
    }
   }