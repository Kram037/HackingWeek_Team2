package HackingWeek_Team2.it.entities;

public class Motorcycle extends MotorVehicle {

    private int engineTimes;

    public Motorcycle(String marca, int anno, double cilindrata, int tempi) {
        super(marca, anno, cilindrata);
        this.engineTimes = tempi;
    }

    public int getEngineTimes() {
        return engineTimes;
    }

    public void setEngineTimes(int engineTimes) {
        this.engineTimes = engineTimes;
    }

    @Override
    public void info() {
        super.info();
        System.out.println(" - engine times: " + engineTimes);
    }

}
