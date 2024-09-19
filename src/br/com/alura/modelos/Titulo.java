package br.com.alura.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String name, int ano, int duracao){
        this.nome = name;
        this.anoDeLancamento = ano;
        this.duracaoEmMinutos = duracao;
    }

    public double getSomaDasAvaliacoes() {return somaDasAvaliacoes;}

    public int getTotalDeAvaliacoes() {return totalDeAvaliacoes;}

    public double obtemMediasDasAvaliacoes(){return this.somaDasAvaliacoes/this.totalDeAvaliacoes;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.modelos.Filme: "+this.nome);
        System.out.println("Ano de Lançamento: "+ this.anoDeLancamento);
    }

    public void avalia(double nota){
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }
}
