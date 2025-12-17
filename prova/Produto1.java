package prova;

public class Produto1 {
    private String nome;
    private double preco;

    void setnome(String nome) {
        this.nome = nome;
    }

    String getnome() {
        return nome;
    }

    void setpreco(double preco) {

        if (preco > 0) {
        this.preco= preco;
        } else {
            System.out.println("Valor inválido.");
        }
    }

    double getpreco() {
        return preco;
    }

    // construtor
    public Produto1(String nome, double preco) {
        this.nome = nome;
        setpreco(preco);
    }

    void exibirinfo() {
        System.out.println("O nome é: " + nome);
        System.out.println("A preco é: " + preco);
    }
    public static void mostrarproduto(Produto1 p){
        p.exibirinfo();
    }
}
