package prova;

public class Main1 {
    public static void main(String[] args) {
        //1 e 4
        Produto1 a1 = new Produto1("kinder ovo", -10);
        Produto1 a2 = new Produto1("cafe", -10);
        a1.exibirinfo();
        a2.exibirinfo();
        // 2
        ProdutoDigital a3 = new ProdutoDigital("kingston", 100000, 15674);
        a3.exibirinfo();
        //3
        Produto1.mostrarproduto(a1);
        Produto1.mostrarproduto(a3);
    }
}
