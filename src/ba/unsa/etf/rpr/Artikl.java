package ba.unsa.etf.rpr;

public class Artikl {
    String imeArtikla; double cijenaArtikla; String kodArtikla;
    public Artikl(String imeArtikla, double cijenaArtikla, String kodArtikla){
        this.imeArtikla=imeArtikla;
        this.cijenaArtikla=cijenaArtikla;
        this.kodArtikla=kodArtikla;
    }
    public String getNaziv(){
        return imeArtikla;
    }
    public int getKod(){
        return kodArtikla;
    }
    public double getCijena(){
        return cijenaArtikla;
    }

}
