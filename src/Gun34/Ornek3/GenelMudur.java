package Gun34.Ornek3;

public class GenelMudur extends Calisan{

    private double tazminat ;

    public GenelMudur(String isim, double maas, int maasKatsayisi, double tazminat) {
        super(isim, maas, maasKatsayisi);
        setTazminat(tazminat);
    }
    public double maasHesapla ()
    {
        return super.maasHesapla()+tazminat;
    }

    public double getTazminat() {
        return tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }

    @Override
    public String toString() {
        return "GenelMudur{" +
                "tazminat=" + tazminat +
                "maas="+ super.getMaas()+
                "maasKatsayisi="+ super.getMaasKatsayisi()+
                '}';
    }
}
