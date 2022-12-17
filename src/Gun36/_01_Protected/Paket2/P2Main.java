package Gun36._01_Protected.Paket2;

import Gun36._01_Protected.Paket2.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan h = new P1Hayvan();
        h.ad="karabas";
        // h. yas default gibi sadece kendi paketinden erisilir

        Kedi k = new Kedi("kopuk","Scotish");
        System.out.println("k = " + k);
    }
}
