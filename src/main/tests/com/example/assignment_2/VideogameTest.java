package com.example.assignment_2;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class VideogameTest {

    private Videogame videoGame1;
    private Videogame videoGame2;

    @Before
    public void setUp() throws Exception {
        videoGame1 = new Videogame("Final Fantasy 7",80,"Square");
        videoGame2 = new Videogame("Final Fantasy 6", 30, "Square");

    }

    @Test
    public void setPrice() {
        videoGame1.setPrice(80);
        assertEquals(80, videoGame1.getPrice(), 0.0);

    }

    @Test
    public void setPriceInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            videoGame1.setPrice(0);

        });

    }

    @Test
    public void setTitle() {
        videoGame1.setTitle("Final Fantasy 7");
        assertEquals("Final Fantasy 7", videoGame1.getTitle());

    }

    @Test
    public void setTitleInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            videoGame1.setTitle("Cthulhu Saves the World: Super Hyper Enhanced Championship Edition Alpha Diamond DX Plus Alpha FES HD – Premium Enhanced Game of the Year Collector's Edition (without Avatars!)'");

        });

    }

    @Test
    public void setCompany() {
    videoGame1.setCompany("Square");
    assertEquals("Square",videoGame1.getCompany());

    }

    @Test
    public void setCompanyInvalid() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            videoGame1.setCompany("Muenchener Rueckversicherungs Gesellschaft in Muenchen AG");

        });

    }

    @Test
    public void setToString() {
        assertEquals("Final Fantasy 7", videoGame1.toString());

    }



}