package Gun37.Ornek4;

public class A4 implements IGosterir,Iyazdirir{

    @Override
    public void goster() {
        System.out.println("Gosterdi");
    }

    @Override
    public void yazdir() {
        System.out.println("Yazdirdi");
    }
}
