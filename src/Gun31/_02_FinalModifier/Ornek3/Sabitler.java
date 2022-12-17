package Gun31._02_FinalModifier.Ornek3;

public class Sabitler {
    final static int birgundekiSaatSayisi =24;
    final static int birsaattekiDakikaSayisi=60;
    final static int birdakikadakiSaniyeSayisi=60;

    public static int toSecond (int gun,int saat,int dakika)
    {
        int toplamSaniye = gun*Sabitler.birgundekiSaatSayisi*Sabitler.birsaattekiDakikaSayisi*Sabitler.birdakikadakiSaniyeSayisi
                +
                saat*Sabitler.birsaattekiDakikaSayisi*Sabitler.birdakikadakiSaniyeSayisi
                +
                dakika*Sabitler.birdakikadakiSaniyeSayisi;
        return toplamSaniye;
    }

}
