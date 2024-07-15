package com.cc.java;

public class App {
    

    public static void main(String[] args) {

        // Instanziierung --> Erzeugen eines Objektes
        // System.out.println(new Cat());
        
        // cat --> Referenzvariable
        // Cat --> Referenztyp (Klasse)
        // Cat cat = new Cat();
        // System.out.println("Blick von außen: " + cat);
        // cat.tellYoutAddress();

        // App app = new App();
        // app.output("test");

        // oder bei Methode "static" verwenden
        // output("test");

        Cat cat = new Cat();
        output("Blick von Innen: " + cat.getInstanceVariable());

        //System.out.println("---------------------");

        //Cat cat2 = new Cat();
        //System.out.println("Blick von außen: " + cat2);

        //cat.tellYoutAddress();

        //cat2.tellYoutAddress();

    }

    // Statische Methode, die in der Klasse ausgeführt wird ...
    public static void output(String  cat){
        System.out.println(cat);
 
    }



}

