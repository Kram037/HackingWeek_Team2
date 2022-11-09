package it.entities;

public class Moto extends VeicoloAMotore{

    public int tempi;

    public Moto(String marca, int anno, double cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }


    @Override
    public void info() {
        System.out.println(marca + " " + anno + " " + cilindrata + " - " + tempi);
    }
}
