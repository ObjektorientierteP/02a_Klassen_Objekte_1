package com.cc.java;

public class App {
    

    public static void main(String[] args) {

        // Instanziierung --> Erzeugen eines Objektes
        // System.out.println(new Cat());
        
        // cat --> Referenzvariable
        // Cat --> Referenztyp (Klasse)
        Cat cat = new Cat();
        System.out.println("Blick von außen: " + cat);
        cat.tellYoutAddress();

        System.out.println("---------------------");

        Cat cat2 = new Cat();
        System.out.println("Blick von außen: " + cat2);

        // cat.tellYoutAddress();

        cat2.tellYoutAddress();


    }

}

