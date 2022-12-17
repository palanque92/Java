package Gun38.Ornek1;

public class Bus extends Vehicle implements IDiesel {

    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String ChangeDiesel() {
        return "750.000 km 'ye kadar kullanirsin";
    }

    @Override
    public String drive() {
        return "Otomatik vites";
    }
}
