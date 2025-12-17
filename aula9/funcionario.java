package aula9;

public class funcionario {
    String nome;
    double salario,bonus;
    void exibirinfo(){
        System.out.println("nome: "+nome);
        System.out.println("salario: "+salario);
        System.out.println("o salario com bonus e: "+calcularbonus());
    }
        public double calcularbonus(){
     bonus= (salario*(bonus/100))+salario;
     return bonus;
    }
    
}
