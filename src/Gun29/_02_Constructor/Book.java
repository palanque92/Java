package Gun29._02_Constructor;

public class Book {
    String name;
    int publishYear;
    String author ;

    Book(){
    }

    Book(String name,String author){
        this.name=name;
        this.author=author;
        this.publishYear=0;
    }
    Book(String name){
        this(name,"");
    }
    void yazdir () {
        System.out.println(name+" "+publishYear+" "+author);
    }
    public String toString(){
        return name + " " + author + " " + publishYear;
    }


}
