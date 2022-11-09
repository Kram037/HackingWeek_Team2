package it.entities;

public class Furgone extends VeicoloAMotore{

    public double capacità;

    public Furgone(String marca, int anno, double cilindrata, double capacità) {
        super(marca, anno, cilindrata);
        this.capacità = capacità;
    }

    @Override
    public void info() {
        System.out.println(marca + " " + anno + " " + cilindrata + " - " + capacità);
    }
}
