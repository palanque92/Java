package Gun30.Soru;

public class musteriHesap {
        int gelenParaToplam =0;
        int cekilenParaToplam =0;
        private int bakiye =0;

        void paraYatir (int gelenPara)
        {
                this.gelenParaToplam=this.gelenParaToplam+gelenPara;
                this.bakiye=this.bakiye+gelenPara;
        }

        void paraCek (int cekilenPara)
        {
                this.cekilenParaToplam=this.cekilenParaToplam;
                this.bakiye=this.bakiye-cekilenPara;
        }

        @Override
        public String toString() {
                return "musteriHesap{" +
                        "yatan=" + gelenParaToplam +
                        ", cekilen=" + cekilenParaToplam +
                        ", bakiye=" + bakiye +
                        '}';
        }
}
