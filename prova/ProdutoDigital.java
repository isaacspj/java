package prova;

public class ProdutoDigital extends Produto1 {
    double tamanhoMB;

    public ProdutoDigital(String nome, double tamanhoMB, double preco) {
        super(nome, preco);
        this.tamanhoMB = tamanhoMB;
    }
    @Override
    void exibirinfo(){
        super.exibirinfo();
        System.out.println("o tamanho e "+tamanhoMB);
    }
}
