package HackingWeek_Team2.it.entities;

public class Auto extends VeicoloAMotore{

    private int porte;
    private String alimentazione; //diesel - benzina

    public Auto(String marca, int anno, double cilindrata, int porte, String alimentazione) {
        super(marca, anno, cilindrata);
        this.porte = porte;
        this.alimentazione = alimentazione;
    }

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
        this.porte = porte;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(porte + " " + alimentazione);
    }
}

