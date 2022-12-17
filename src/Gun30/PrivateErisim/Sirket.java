package Gun30.PrivateErisim;

public class Sirket {
    public static void main(String[] args) {
     Calisan worker = new Calisan();

     worker.id=1;
     worker.name="Omer";
     worker.surname="Boncuk";
   //worker.password="123"; // direk erisilebiliyor
                            // hemde kontrolsuz atandi
                            // direk erisime kapali olmali

        worker.sifreAta("123");
        worker.sifreAta("adamiwew1231354uzerler");

        worker.sifreGoster();
    }
}
