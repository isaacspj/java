package aula9;

public class vendedor extends funcionario{
        @Override
    public double calcularbonus(){
     bonus= (salario*(10/100.0))+salario;
     return bonus;
    }
}
