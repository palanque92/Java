package Gun35.Odev.Soru3;

import Gun35.Odev.Soru3.Bicycle;

public class Car extends Bicycle {
    public Car(int speed) {
        super(speed);
    }
    @Override
    public void changeGear(int speed) {
        speed= GetSpeed();
        if (speed>=0){
            SetGear(1);
        }
        if (speed>=20){
            SetGear(2);
        }
        if (speed>=40){
            SetGear(3);
        }
        if (speed>=60){
            SetGear(4);
        }
        if (speed>=80){
            SetGear(5);
        }

    }

    @Override
    public void speedUp(int speed) {
        speed+=10;
        SetSpeed(speed);
        changeGear(speed);
    }

    @Override
    public void applyBreaks(int speed) {
        speed-=10;
        SetSpeed(speed);
        changeGear(speed);
    }
}
