package be.intecbrussel;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(-4,4);
        Square S = new Square(-5);

        double a = Math.random();
        double V = a<0.5? 1 : 2;

        System.out.println(a);
        System.out.println(V);

        if ( V==1){
            System.out.println(R.getArea());}

        else {
            System.out.println(S.getArea());
        }
        System.out.println(Shape.getCount());


    }




    }








