package aula7;

public class Aula1 {
    public static void main(String[] args) {
        Carro meuCarro =  new Carro();
        meuCarro.setModelo("fusca");
        meuCarro.setAno(-1000);
        meuCarro.setmarca("fusca antes de cristo");
        meuCarro.setvelMax(1000000000);
        meuCarro.acelerar();
    }
}
