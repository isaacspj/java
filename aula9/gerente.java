package aula9;
public class gerente extends funcionario{
    String responsavelLoja;

    @Override
    public double calcularbonus(){
     bonus= salario + (salario*(20/100.0));
     return bonus;
    }
}