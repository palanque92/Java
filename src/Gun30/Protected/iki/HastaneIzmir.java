package Gun30.Protected.iki;

import Gun30.Protected.bir.Doctor;

public class HastaneIzmir {
    public static void main(String[] args) {
        Doctor dr = new Doctor("Ersan");
        // Doctor dr1 = new Doctor(); -> default sadece kendi paketindekilere ulasabilir.
        dr.hastaneAdi="Katip celebi Hastanesi";

    }
}
