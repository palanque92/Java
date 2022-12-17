package Gun29._04_Constructor;

public class Banka {
    String adi ;
    int subeSayisi ;
    int kurulusYili ;
    double faizOrani ;


    Banka(String adi,int subeSayisi,int kurulusYili,double faizOrani){
        this.adi=adi;
        this.subeSayisi=subeSayisi;
        this.kurulusYili=kurulusYili;
        this.faizOrani=faizOrani;



    }

    public Banka(String adi, int subeSayisi,double faizOrani) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.faizOrani=faizOrani;
        this.kurulusYili=0;

    }

    @Override
    public String toString() {
       String donecek = "Banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                '}';
                if (kurulusYili>0)
                    donecek+= " , kurulusYili = " + kurulusYili ;
                return donecek ;

    }
    void yazdir () {
        System.out.println(adi+" "+subeSayisi+" "+kurulusYili+" "+faizOrani);
    }
}
