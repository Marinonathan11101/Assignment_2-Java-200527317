package com.example.assignment_2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StoreTest {

    private Store store1;
    private Videogame videoGame1;

    private Videogame videoGame2;
    private Store store2;
    @Before
    public void setUp() throws Exception {
        videoGame1 = new Videogame("Final Fantasy 7",80,"Square");
        videoGame2 = new Videogame("Final Fantasy 6", 30, "Square");
        store1 = new Store();
        store1.addItems(videoGame1);
        store1.addItems(videoGame2);
    }

    @Test
    public void addItems() {
        store1.addItems(new Videogame("Final Fantasy 7",50,"Square"));

    }

    @Test
    public void removeItems() {
        store1.removeItems(new Videogame("Final Fantasy 7",50,"Square"));
    }

    @Test
    public void getInventory() {
        store1.getInventory();
    }

    @Test
    public void getTotalPrice() {
        assertEquals(110, store1.getTotalPrice(),0.0);
    }

    @Test
    public void getVideogameAtIndex() {
       assertEquals(videoGame1, store1.getVideogameAtIndex(0));
    }

    @Test
    public void getVideogameAtIndexInvalid() {
        assertEquals(null, store1.getVideogameAtIndex(27));
    }
}