package model;

import java.util.Scanner;

public class Conversor {
    public double nota1;
    public double nota2;
    public double nota3;
    public double nota4;
    public double media;
    public double somaDasNotas;
    public String nomeDoAluno;

    public void obterDadosDoAluno(){    //Nome de função sempre tem que ser um verbo
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dados do aluno(a)");
        System.out.println("--------------");
        System.out.println("Qual o nome do aluno(a)?");
        nomeDoAluno = leitor.nextLine();

        System.out.println("Qual a nota 1 do aluno(a) " + nomeDoAluno + "?");
        nota1 = leitor.nextDouble();
        System.out.println("Qual a nota 2 do aluno(a) " + nomeDoAluno + "?");
        nota2 = leitor.nextDouble();
        System.out.println("Qual a nota 3 do aluno(a) " + nomeDoAluno + "?");
        nota3 = leitor.nextDouble();
        System.out.println("Qual a nota 4 do aluno(a) " + nomeDoAluno + "?");
        nota4 = leitor.nextDouble();

        calcularMediaDoAluno();

    }
    public void calcularMediaDoAluno(){
        somaDasNotas = nota1 + nota2 + nota3 + nota4;
        media = somaDasNotas / 4;

        exibirResultados();
    }
    public void exibirResultados(){
        System.out.println("---------------");
        System.out.println("Média do aluno: " + media);
        if (media >= 5){
            System.out.println("O(a) aluno(a) " + nomeDoAluno + " foi aprovado!");
        }
        else if(media < 4) {  //É preferível utilizar else if ao invés de vários if,
                             // pois nesse caso ambos estão com a mesma condição
                             // A execução no else if ocorre em cascata
            System.out.println("O(a) aluno(a) " + nomeDoAluno + " foi reprovado:(");
        }
        else{
            System.out.println("O(a) aluno(a) " + nomeDoAluno + " está de recuperação");
        }
        System.out.println("F I M");
        System.out.println("-----");
    }

}
