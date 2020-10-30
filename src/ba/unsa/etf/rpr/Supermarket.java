package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {
    ArrayList<Artikl> artikli = new ArrayList<Artikl>();
    public boolean dodajArtikl(Artikl a){
        if(artikli.size()<50){
            artikli.add(a);
            return true;
        }
        return false;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=0;i<artikli.size();i++){
            if(kod.equals(artikli.get(i).getKod())){
                Artikl tmp = artikli.get(i);
                artikli.remove(i);
                return tmp;
            }
        }
        return null;
    }

    public ArrayList<Artikl> getArtikli() {
        return artikli;
    }
}

