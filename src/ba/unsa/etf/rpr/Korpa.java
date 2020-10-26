package ba.unsa.etf.rpr;

public class Korpa {
    Artikl[] artikli;

    public void dodajArtikl(Artikl a){
        if(artikli.length<50){
            artikli[artikli.length+1]=a;
        }
    }
    public Artikl[] getArtikli() {
        return artikli;
    }
    public void izbaciArtiklSaKodom(String kod){
        for(int i=0;i<artikli.length;i++){
            if(kod.equals(artikli[i])){
                for (int j=i;j<artikli.length;j++){
                    artikli[j]=artikli[j+1]
                }
            }
        }
    }
    public double dajUkupnuCijenuArtikala(){
        double suma=0;
        for(int i=0;i<artikli.length;i++){
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }

}
