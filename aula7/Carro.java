package aula7;
public class Carro {
    private String modelo,marca;
    private int ano;
    private double velMax;

    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
    return modelo;
    }
    void setAno(int ano){
        this.ano=ano;
    }
    int getAno(){
    return ano;
    }
    void setmarca(String marca){
        this.marca=marca;
    }
    String getmarca(){
        return marca;
    }
    void setvelMax(double velMax){
        this.velMax=velMax;
    }
    double getvelMax(){
        return velMax;
    }
    void acelerar(){
        System.out.println("o carro de marca e modelo "+marca+" "+modelo+" do ano "+ano+" esta acelerando a uma velocidade de "+velMax);
    }
}
