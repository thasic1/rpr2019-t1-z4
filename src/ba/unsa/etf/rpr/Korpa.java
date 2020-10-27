package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli;

    public boolean dodajArtikl(Artikl a){
        if(artikli.length<50){
            artikli[artikli.length+1]=a;
            return true;
        }
        return false;
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

    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0;i<artikli.length;i++){
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }
}
