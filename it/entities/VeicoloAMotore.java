package HackingWeek_Team2.it.entities;

public abstract class VeicoloAMotore {

    private String marca;
    private int anno;
    private double cilindrata;

    public VeicoloAMotore(String marca, int anno, double cilindrata) {
        this.marca = marca;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public double getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(double cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void info(){
        System.out.println(marca + " " + anno + " " + cilindrata);
    }

    @Override
    public String toString() {
        return "VeicoloAMotore{" +
                "marca='" + marca + '\'' +
                ", anno=" + anno +
                ", cilindrata=" + cilindrata +
                '}';
    }
}
