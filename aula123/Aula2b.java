package aula123;
public class Aula2b {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "isaac";
        conta.titular();
        conta.depositar(-200);
        conta.sacar(1250.0);
    }
}