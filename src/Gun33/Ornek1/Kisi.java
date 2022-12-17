package Gun33.Ornek1;

public class Kisi {
    String ad;
    String soyad ;
    private int yas ;

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
    void yasAta (int yas)
    {
        if (yas > 0)
            this.yas=yas;
        else
            System.out.println("hatali yas");
    }
    int yasVer ()
    {
        return this.yas;
    }
    void setAd (String ad)
    {
        if (ad.length()<25)
           this.ad=ad;
    }
    String getAd ()
    {
        return this.ad;
    }
    void setSoyadd (String soyad)
    {
        if (ad.length()<25)
            this.soyad=soyad;
    }
    String getSoyad ()
    {
        return this.soyad;
    }

}
