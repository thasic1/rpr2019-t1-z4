package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    @Test
    void test1(){
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Sveska", 2, "svs"));
        korpa.dodajArtikl(new Artikl("Olovka", 1, "olv"));
        Artikl artikl = korpa.izbaciArtiklSaKodom("svs");
        Artikl a = new Artikl("Sveska", 2, "svs");
        assertEquals(a.getKod(),artikl.getKod());
        assertEquals(a.getNaziv(),artikl.getNaziv());
    }
    @Test
    void test2(){
        Korpa korpa = new Korpa();
        assertTrue(korpa.dodajArtikl(new Artikl("Mobitel", 500, "mob")));
    }
    @Test
    void test3(){
        Korpa korpa =new Korpa();
        korpa.dodajArtikl(new Artikl("Sveska", 2, "svs"));
        korpa.dodajArtikl(new Artikl("Olovka", 1, "olv"));
        Artikl a = korpa.izbaciArtiklSaKodom("pp");
        assertNull(a);
    }
    @Test
    void ukupnaCijena(){
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("Sveska", 2, "svs"));
        korpa.dodajArtikl(new Artikl("Olovka", 1, "olv"));
        assertEquals(3,korpa.dajUkupnuCijenuArtikala());
    }

}