package Gun32.Ornek1;

public class OrnekCozum {
    enum Aylar{
        OCAK,SUBAT,MART,NISAN,MAYIS,HAZIRAN,TENNUZ,AGUSTOS,EYLUL,EKIM,KASIM,ARALIK
    }
    public static void main(String[] args) {
        Aylar ay = Aylar.MAYIS;
        switch (ay)
        {
            case SUBAT: System.out.println("28");break;
            case OCAK:
            case MART:
            case MAYIS:
            case TENNUZ:
            case AGUSTOS:
            case EKIM:
            case ARALIK: System.out.println("31");;
            case NISAN:
            case EYLUL:
            case KASIM:
            case HAZIRAN: System.out.println("30");
        }
        // bordro programinda belli bir ay islem yaptirma
        if (ay == Aylar.MAYIS)
        {
            System.out.println("Zam yapildi");
        }
        // Aylar ay = Aylar.Mayis;
        System.out.println("ay = " + ay); // toString
        System.out.println("ay.name() = " + ay.name()); // SIMGE olarak kullanilan kelimeyi
        System.out.println("ay.ordinal() = " + ay.ordinal()); // SIMGENIN INDEXINI VERIR

        for (Aylar a : Aylar.values()) // Enum yapisindaki tum bilgileri alabiliriz
            System.out.println(a.name() +"-"+ a.ordinal());
    }
}
