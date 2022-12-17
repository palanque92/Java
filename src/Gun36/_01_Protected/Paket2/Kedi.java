package Gun36._01_Protected.Paket2;

import Gun36._01_Protected.Paket2.Paket1.P1Hayvan;

public class Kedi extends P1Hayvan {
    public Kedi (String ad,String cinsi) {
        super.ad=ad;
        super.cinsi=cinsi;
        // protected lara extra olarak extend yoluyla
        // diger paketlerden erisilebilir

    }

    @Override
    public String toString() {
        return "Kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}