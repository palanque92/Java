package Gun35.Odev.Soru3;

public class Bicycle implements IVehicle {
    private int _speed;
    private int _gear;

    public Bicycle (int speed){
        SetSpeed(speed);
    }

    public void SetSpeed(int speed){
        _speed=speed;
    }
    public int GetSpeed(){
        return _speed;
    }
    public void SetGear(int gear){
        _gear=gear;
    }
    public int GetGear(){
        return _gear;
    }

    @Override
    public void changeGear(int speed) {
        speed= GetSpeed();
        if (speed>=0){
            SetGear(1);
        }
        if (speed>=10){
            SetGear(2);
        }
        if (speed>=20){
            SetGear(3);
        }

    }

    @Override
    public void speedUp(int speed) {
        speed+=5;
        SetSpeed(speed);
        changeGear(speed);
    }

    @Override
    public void applyBreaks(int speed) {
        speed-=5;
        SetSpeed(speed);
        changeGear(speed);
    }

    @Override
    public String toString() {
        return "Su anki hiziniz = " +
                GetSpeed() +
                "\nSu anki vitesiniz = " + GetGear();
    }
}
