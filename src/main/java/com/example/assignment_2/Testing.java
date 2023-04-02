package com.example.assignment_2;

public class Testing {

    public static void main(String[] args) {

       Videogame videogame1 = new Videogame("Final Fantasty",70,"Square");
       Store store = new Store();
       store.addItems(videogame1);
       System.out.println(store.getInventory());






    }
}
