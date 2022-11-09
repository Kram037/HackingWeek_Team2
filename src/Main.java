import it.entities.Auto;
import it.entities.Furgone;
import it.entities.Moto;
import it.entities.VeicoloAMotore;

public class Main {
    public static void main(String[] args) {

        VeicoloAMotore auto = new Auto("FIAT", 1998, 6, 4, "diesel");
        VeicoloAMotore moto = new Moto("ducati", 2000, 4, 9);
        VeicoloAMotore furgone = new Furgone("MAN", 2022, 10, 1500.6);

        auto.info();
        moto.info();
        furgone.info();
    }
}