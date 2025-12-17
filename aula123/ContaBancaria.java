package aula123;
public class ContaBancaria {
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
       System.out.println("voce vai sacar: "+valor);
        System.out.println("Saldo e: R$" + saldo);
       if (valor <= saldo) {
            saldo -= valor;
        } else{
        System.out.println("voce nao pode sacar esse valor");
        }      
    }

    void titular(){
        System.out.println("o titular e: "+titular);
    }
}