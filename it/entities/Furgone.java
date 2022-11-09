package HackingWeek_Team2.it.entities;

public class Furgone extends VeicoloAMotore{

    private double capacità;

    public Furgone(String marca, int anno, double cilindrata, double capacità) {
        super(marca, anno, cilindrata);
        this.capacità = capacità;
    }

    public double getCapacità() {
        return capacità;
    }

    public void setCapacità(double capacità) {
        this.capacità = capacità;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(capacità);
    }
}
