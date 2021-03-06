package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    @Test
    void test1(){
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Hljeb",1,"hlb"));
        supermarket.dodajArtikl(new Artikl("Sok", 2, "sk"));
        Artikl a = supermarket.izbaciArtiklSaKodom("sk");
        assertEquals("sk",a.getKod());
    }
    @Test
    void test2() {
        Supermarket supermarket = new Supermarket();
        assertTrue(supermarket.dodajArtikl(new Artikl("Auto", 15000, "audi")));
    }
    @Test
    void test3(){
       Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("Sveska", 2, "svs"));
        supermarket.dodajArtikl(new Artikl("Olovka", 1, "olv"));
        Artikl a = supermarket.izbaciArtiklSaKodom("pp");
        assertNull(a);
    }

}