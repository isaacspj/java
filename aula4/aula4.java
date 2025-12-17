package aula4;

public class aula4 {
    public static void main(String[] args) {
        Identidade pessoa = new Identidade();
        pessoa.nome ="isaac";
        pessoa.idade = 5;
        pessoa.altura = 1.65;
        pessoa.ativo = true;
        pessoa.nota1 = 9;
        pessoa.nota2=10;
        pessoa.apresentar();
        pessoa.media();
        pessoa.fase();
    }
}
