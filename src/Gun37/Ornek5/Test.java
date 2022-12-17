package Gun37.Ornek5;

public class Test implements IGosterir,IYazdirir {

    @Override
    public void goster() {
        System.out.println("Goster");
    }

    @Override
    public void yaz(String msg) {
        System.out.println(msg);
    }

    @Override
    public void yaz() {
        System.out.println("Yaz");
    }
}
