package com.cheekin;
import java.util.Scanner;
//Main class
class Main_Fruit {
    public static void main(String[] args) {
        Fruit A = new Fruit("Fruit");
        System.out.println(A);

        Cantaloupe a = new Cantaloupe("Cantaloupe", "Yellow", 10);
        System.out.println(a);

        Apple b = new Apple("Apple", "Cooking and Eating", "Red Apple & Green Apple");
        System.out.println(b);

        RedApple c = new RedApple("Red Apple", "Cooking and Eating", "Jumani Apple" , "Red");
        System.out.println(c);

        GreenApple d = new GreenApple("Green Apple", "Eating", "Merton Worcester" , "Green");
        System.out.println(d);


    }
}

