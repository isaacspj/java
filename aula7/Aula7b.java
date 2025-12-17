package aula7;
public class Aula7b {
    public static void main(String[] args) {
        Banco conta = new Banco();
        conta.settitular("isaac");
        conta.depositar(-20);
        System.out.println("saldo "+conta.getsaldo());
    }
}       