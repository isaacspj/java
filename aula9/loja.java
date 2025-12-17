package aula9;

public class loja {
    public static void main(String[] args) {
        gerente g = new gerente();
        g.responsavelLoja="loja lago sul";
        g.nome="isaac";
        g.salario=10000;
        g.exibirinfo();
        vendedor n = new vendedor();
        n.nome="lucas";
        n.salario=1500;
        n.exibirinfo();
        }
}
