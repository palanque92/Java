package Gun27._03_Ornek;

public class Person {
    String name ;
    String surname ;
    int age ;

    void bilgiYazdir()
    {
        System.out.println("personnel information = " + name+" "+surname+" "+age);
    }
    int getBirthdayYear()
    {
        return 2022-age;
    }
    String getInitials()
    {
        String donecek=name.toUpperCase().charAt(0)+" "+surname.toUpperCase().charAt(0);
        return donecek;
    }

}
