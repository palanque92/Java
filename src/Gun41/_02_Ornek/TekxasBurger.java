package Gun41._02_Ornek;

public class TekxasBurger implements Hamburger {

    @Override
    public void delicious() {
        System.out.println("Dana'nin sirtindaki etin %80'i , %20'si de kuzunun bosluk yagindan");
    }

    @Override
    public int price() {
        return 200;
    }
    void marinade () {
        System.out.println("Et soslanir ve baharatlanir.");
    }
    void grill () {
        System.out.println("Hazirlanmis olan kofte burgeri izgarada 15 dakika pisirilir.");
    }

}
