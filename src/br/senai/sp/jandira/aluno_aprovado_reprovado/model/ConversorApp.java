package br.senai.sp.jandira.aluno_aprovado_reprovado.model;

public class ConversorApp {
    public static void main(String[] args) {
        System.out.println("Iniciando a aplicação");
        Conversor conversor = new Conversor();
        conversor.obterDadosDoAluno();
    }
}
