package Gun35.Odev.Soru3;

import Gun35.Odev.Soru3.Bicycle;
import Gun35.Odev.Soru3.Car;

public class Main {
    public static void main(String[] args) {
            Bicycle b1= new Bicycle(10);
            b1.speedUp(b1.GetSpeed());
            b1.speedUp(b1.GetSpeed());

            System.out.println(b1);
            b1.applyBreaks(b1.GetSpeed());

            System.out.println(b1);

            Car c1= new Car(10);
            c1.speedUp(c1.GetSpeed());
            c1.speedUp(c1.GetSpeed());
            c1.speedUp(c1.GetSpeed());
            c1.speedUp(c1.GetSpeed());
            c1.speedUp(c1.GetSpeed());
            c1.speedUp(c1.GetSpeed());
            c1.speedUp(c1.GetSpeed());

            System.out.println(c1);

            c1.applyBreaks(c1.GetSpeed());

            System.out.println(c1);
        }
    }

