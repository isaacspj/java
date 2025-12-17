package aula7;

public class Aluno {
    private String nome;
    private double nota;

    void setnome(String nome) {
        this.nome = nome;
    }

    String getnome() {
        return nome;
    }

    void setnota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else {
            this.nota = nota;
            System.out.println("Nota registrada: " + nota);
        }
    }

    double getnota() {
        return nota;
    }

    void apresentar() {
        System.out.println("O nome é: " + nome);
        System.out.println("A nota é: " + nota);
    }
}