package br.com.alura.modelos;
import br.com.alura.calculos.Classificavel;
import br.com.alura.modelos.Titulo;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(){
        super("",0,0);
    }
    public Filme(String nome,int ano, int duracao, String diretor){
        super(nome,ano,duracao);
        this.diretor = diretor;
    }

    public String getDiretor(){return this.diretor;}
    public void setDiretor(String nomeDiretor){this.diretor = nomeDiretor;}

    @Override
    public int getClassificacao() {
        return (int) obtemMediasDasAvaliacoes() /2;
    }
}
