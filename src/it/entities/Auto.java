package it.entities;

public class Auto extends VeicoloAMotore{

    public int porte;
    public String alimentazione; //diesel - benzina

    public Auto(String marca, int anno, double cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public void info() {
        System.out.println(marca + " " + anno + " " + cilindrata + " - " + porte + " " + alimentazione);
    }
}

