package aula8;
public class Aluno {
    String nome ;
    int idade;
    public Aluno(String nome, int idade) {
        this.nome=nome;
        this.idade=idade;
    }
    void apresentar(){
        System.out.println("o nome e "+nome+" e a idade e "+idade);
    }
}
