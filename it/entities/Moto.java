package HackingWeek_Team2.it.entities;

public class Moto extends VeicoloAMotore{

    private int tempi;

    public Moto(String marca, int anno, double cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.tempi = tempi;
    }

    public int getTempi() {
        return tempi;
    }

    public void setTempi(int tempi) {
        this.tempi = tempi;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(tempi);
    }
}
