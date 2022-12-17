package Gun34.Ornek2;

public class Ordek extends Hayvan {
    private int kanatAcikligi ;


    public Ordek(String renk, int kilo, String cins, int kanatAcikligi) {
        super(renk, kilo, cins);
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public void konustu() {
        System.out.println("Vak vak");
    }

    public int getKanatAcikligi() {
        return kanatAcikligi;
    }

    public void setKanatAcikligi(int kanatAcikligi) {
        this.kanatAcikligi = kanatAcikligi;
    }


}
