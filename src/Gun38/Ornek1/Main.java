package Gun38.Ornek1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ToyotaPrius toyotaPrius = new ToyotaPrius("2022",2500);

        TeslaCar teslaCar = new TeslaCar("2022",4000);
        
        Bus bus = new Bus("Merdeces-Bens",700);

        ArrayList<Vehicle> cars = new ArrayList<>();
        cars.add(teslaCar);
        cars.add(toyotaPrius);
        cars.add(bus);

        for (Vehicle v : cars) {
            System.out.println("v.getClass().getSimpleName()  = " + v.getClass().getSimpleName() );
            
            System.out.println("vehicle = " + v.getModel());
            System.out.println("vehicle.getEngine() = " + v.getEngine());

            if (v instanceof TeslaCar) {
                System.out.println("Tesla model S = " + ((TeslaCar) v).changeBattery());
                System.out.println("Tesla model S = " + ((TeslaCar) v).drive());
            }
            System.out.println();
            if (v instanceof ToyotaPrius) {
                System.out.println("Toyota prius  = " + ((ToyotaPrius) v).changeBattery());
                System.out.println("Toyota prius  = " + ((ToyotaPrius) v).drive());
                System.out.println("Toyota prius = " + ((ToyotaPrius) v).changeOil());
            }
            System.out.println();
            if (v instanceof Bus) {
                System.out.println("Bus = " + ((Bus) v).ChangeDiesel());
                System.out.println("Bus= " + ((Bus) v).drive());
            }
            System.out.println();

        }



    }
}
