package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    Artikl[] artikli = new Artikl[50];
    int duzinaArtikli = 0;

    public boolean dodajArtikl(Artikl a){
        if(duzinaArtikli<50){
            artikli[duzinaArtikli]=a;
            duzinaArtikli++;
            return true;
        }
        return false;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0;i<duzinaArtikli;i++){
            if(kod.equals(artikli[i].getKod())){
                Artikl tmp = artikli[i];
                for(int j=i;j<duzinaArtikli-1;j++){
                    artikli[j]=artikli[j+1];
                }
                duzinaArtikli--;
                artikli[duzinaArtikli-1]=null;
                return tmp;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0;i<duzinaArtikli;i++){
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }
}

