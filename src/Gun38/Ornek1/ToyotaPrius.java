package Gun38.Ornek1;

public class ToyotaPrius extends Vehicle implements IElectric, IGas {
    public ToyotaPrius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Omur Boyu Kullan";
    }

    @Override
    public String changeOil() {
        return "Bir depo ile 300 km gider";
    }

    @Override
    public String drive() {
        return "Otomatik vites";
    }
}
