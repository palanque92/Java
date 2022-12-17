package Gun41._02_Ornek;

public class FakirBurger implements Hamburger {


    @Override
    public void delicious() {
        System.out.println("Cok da lezzetli degil ama karin doyurmak icin ideal");
    }

    @Override
    public int price() {
        return 20;
    }
    void marinade () {
        System.out.println("Etin en yagli yeri kullanilir et fazla yoktur ve renklendirici kullanilir.");
    }
    void grill () {
        System.out.println("15 dakikada piser izgarada piser.");
    }
}
