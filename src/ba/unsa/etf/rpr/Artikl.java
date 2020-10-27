package ba.unsa.etf.rpr;

public class Artikl {
    String imeArtikla; int cijenaArtikla; String kodArtikla;
    public Artikl(String imeArtikla, int cijenaArtikla, String kodArtikla){
        this.imeArtikla=imeArtikla;
        this.cijenaArtikla=cijenaArtikla;
        this.kodArtikla=kodArtikla;
    }
    public String getNaziv(){
        return imeArtikla;
    }
    public String getKod(){
        return kodArtikla;
    }
    public int getCijena(){
        return cijenaArtikla;
    }

}
