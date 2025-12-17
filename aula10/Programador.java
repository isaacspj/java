package aula10;

class Programador extends Pessoa implements Trabalhador {
    void falar() {
        System.out.println("Olá!");
}
    public void trabalhar() {
        System.out.println("Programando...");
}
    public void andar(){
        System.out.println("Andando...");
    }
    public void descansar(){
        System.out.println("so mais 10 minutinhos");
    }
}
