package aula123;

public class TemDeTudo {
    String nome;
    int idade;
//pessoas aula 1 a 3
    void apresentarPessoa(){
        System.out.println("ola, meu nome e "
        + nome +" e tenho "+ idade +" anos." );
    }

    double preco;
    int quantidade;

    void exibirProdutos (){
        System.out.println("o nome do produto e "+ nome +" o preco e "+ preco +" a quantidade em estoque e "+ quantidade);
    }
//aula 4 e sobre curso e media essas coisas
double altura,nota1=0,nota2=0,media;
boolean ativo;

void apresentaridentidade(){
    System.out.println("seu nome e: "+nome+" sua idade e: "+idade+" sua altura e: "+altura);
} 
void mediaescola(){
    media=(nota1+nota2)/2;
    System.out.println("suas notas foram "+nota1+","+nota2+" a nota do bimestre e:"+media);
}
void faseidade(){
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
//aula 5 sao coisas de numeros tipo par dia da semanha e essas coisas
int numero;
    int dia;
    void parouimpar(){
        if(numero%2==0){
            System.out.println("o numero "+numero+" e par");
        }else{
            System.out.println("o numero "+numero+" e impar");
        }
    }
   
    void diadasemana(){
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terca");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
                break;
            default:
                System.out.println("nao tem dia da semana"+dia);
        }
    }
    
    void f0r(){
        int i = 1;
         for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }

    }
    void wile(){
        int j=1;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }
    }
    void do_wile(){
        int k=1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);
    }
    // aual 6 coisas de curso tambem e celular
        String   curso,marca,modelo;
    void exiberdadosalunocurso(){
        System.out.println("o nome do aluno e: "+nome+" a idade dele "+idade+" o curso e: "+curso);
    }
    void celular(){
        System.out.println("a marca do celular e "+marca+" o modelo e "+modelo+" e o preco e "+preco);
    }
    //aula 7 sao coisas de notas 
    double nota;

    void setnota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida");
        } else {
            this.nota = nota;
            System.out.println("Nota registrada: " + nota);
        }
    }

    double getnota() {
        return nota;
    }

    void apresentar() {
        System.out.println("O nome é: " + nome);
        System.out.println("A nota é: " + nota);
    }
}




