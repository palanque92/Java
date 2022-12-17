package Gun15;

public class deneme {
    public static void main(String[] args) {
        //Tek for kullanarak yapın.
        //*
        //**
        //***
        //****
        //*****
        //*****
        //****
        //***
        //**
        //*

        for (int i = 0; i < 10; i++) {
            if (i<5){
                for (int yildiz = 0; yildiz <= i; yildiz++ ) {
                    System.out.print("*");
                }
            }
            else
                for (int yildiz=10 ; yildiz >i; yildiz--){
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}
