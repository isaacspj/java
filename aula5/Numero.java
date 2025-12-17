package aula5;

public class Numero {
    int numero;
    int dia;
    void qual_e(){
        if(numero%2==0){
            System.out.println("o numero "+numero+" e par");
        }else{
            System.out.println("o numero "+numero+" e impar");
        }
    }
   
    void dia(){
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
}
