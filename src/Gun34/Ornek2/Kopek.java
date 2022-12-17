package Gun34.Ornek2;

public class Kopek extends Hayvan {

    public Kopek(String renk, int kilo, String cins) {
        super(renk, kilo, cins);
    }

    @Override
    public void konustu() {
       // super.konustu();
        System.out.println("Havladi");
    }
}
