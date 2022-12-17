package Gun35.Ornek2;

public class Daire extends Sekil {
   private int yaricap ;

    public Daire(int yaricap) {
        setYaricap(yaricap);
    }

   public double alan () {
        return Math.PI * yaricap * yaricap ;
   }
    public double cevre () {
        return Math.PI * 2 * yaricap;
    }


    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

}
