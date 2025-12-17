package aula7;
public class Banco {
    String titular;
    double saldo=100;

    void depositar(double valor) {
        
        if (valor > 0) { 
            saldo+=valor;

        }else{
            System.out.println("Voce não pode realizar esse Deposito");
        }
        
    
    }
    double getsaldo(){
   return saldo; 
    }


    void settitular( String titular){
        System.out.println("o titular e: "+titular);
    }
    String getTitular(){
        return titular;
    }
}