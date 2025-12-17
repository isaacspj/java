package aula4;

public class Identidade {
int idade;
double altura,nota1=0,nota2=0,media;
boolean ativo;
String nome;
void apresentar(){
    System.out.println("seu nome e: "+nome+" sua idade e: "+idade+" sua altura e: "+altura);
} 
void media(){
    media=(nota1+nota2)/2;
    System.out.println("suas notas foram "+nota1+","+nota2+" a nota do bimestre e:"+media);
}
void fase(){
    if(idade<18 && idade>=15){ 
        System.out.println("voce ta no ensino medio");
    }else if(idade<15 && idade >=6){
        System.out.println("voce ta no ensino fundamental");
    }else if(idade<=0){
        System.out.println("voce ainda nem nasceu rapais");
    } else{
        System.out.println("tu ja fez foi passar da escola");
    }
}
}
