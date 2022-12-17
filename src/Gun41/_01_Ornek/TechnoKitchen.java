package Gun41._01_Ornek;


public class TechnoKitchen {

    public static void hazirla(IFood food)
    {
         if (food instanceof AdanaKebap)
         {
             ((AdanaKebap)food).marinade();
             ((AdanaKebap)food).grill();
             ((AdanaKebap)food).taste();
         }
         else
         if (food instanceof Lahmacun)
         {
             ((Lahmacun)food).dough();
             ((Lahmacun)food).addMeat();
             ((Lahmacun)food).bake();
         }
         else
             if (food instanceof Borsh)
             {
                 ((Borsh)food).taste();
                 ((Borsh)food).boil();
                 ((Borsh)food).eatTomarrow();
             }
             else
                 if (food instanceof Palov)
                 {
                     ((Palov)food).taste();
                     ((Palov)food).fry();
                     ((Palov)food).boil();
                 }
         //****** diğer yemekler eklenecek

    }



}
