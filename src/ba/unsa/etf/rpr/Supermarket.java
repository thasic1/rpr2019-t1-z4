package ba.unsa.etf.rpr;

public class Supermarket {
    Artikl[] artikli;
    public void dodajArtikl(Artikl a){
        if(artikli.length<1000){
            artikli[artikli.length+1]=a;
        }
    }
    public Artikl[] getArtikli() {
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0;i<artikli.length;i++){
            if(kod.equals(artikli[i].getKod())){
                for (int j=i;j<artikli.length-1;j++){
                    artikli[j]=artikli[j+1];
                }
            }
        }
        return null;
    }

}
