package aula123;
public class Aula2a {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.nome ="leite";
        p1.preco = 4.99;
        p1.quantidade = 100;
        p1.exibirDetalhes();
        Produto p2 = new Produto();
        p2.nome ="cafe";
        p2.preco = 27.50;
        p2.quantidade = 500;
        p2.exibirDetalhes();

    }
}
