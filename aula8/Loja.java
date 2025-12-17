package aula8;
    public class Loja {
    String nomeProduto;
    private double preco, porcentagem;

   
    public Loja(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public void setPorcentagem(double porcentagem){
        this.porcentagem = porcentagem;
    }

 // 10 porcento de desconto
    public double calcularDesconto() {
        return preco * 0.90;
    }

  //por percentual/porcentagem
    public double calcularDesconto(double porcentagem) {
        return preco - (preco * porcentagem / 100);
    }
    void apresentar(){
        System.out.println("o produto e "+nomeProduto+"\n o valor sem desconto e "+preco+" \no valor com 10% de desconto e "+calcularDesconto()+"\n e o preco com o desconto variavel e "+calcularDesconto(porcentagem));
    }
}

