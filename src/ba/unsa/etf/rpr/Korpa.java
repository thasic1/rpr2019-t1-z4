package ba.unsa.etf.rpr;


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
                for(int j=i;j<duzinaArtikli;j++){
                    artikli[j]=artikli[j+1];
                }
                duzinaArtikli--;
                artikli[duzinaArtikli]=null;
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

