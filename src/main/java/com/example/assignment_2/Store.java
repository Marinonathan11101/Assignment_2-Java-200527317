package com.example.assignment_2;

import java.util.ArrayList;

public class Store {

    private ArrayList<Videogame> inventory;

    public Store(){
       inventory = new ArrayList<Videogame>();
    }

    public void addItems(Videogame videogame){
        inventory.add(videogame);

    }

    public void removeItems(Videogame videogame){
        inventory.remove(videogame);
    }

    public ArrayList<Videogame> getInventory() {

        return inventory;
    }

    public double getTotalPrice(){
        double total = 0.0;

        for (int i=0; i < inventory.size();i++)
        {
            total = total + inventory.get(i).getPrice();
        }

        return total;
    }

    public Videogame getVideogameAtIndex(int Index){
        if(Index >= 0 && Index <= inventory.size()-1)
        {
            return inventory.get(Index);
        }
        return null;
    }

}
