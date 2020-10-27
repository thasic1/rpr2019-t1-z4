package ba.unsa.etf.rpr;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
            if(kod.equals(artikli[i].getKod())){
                for (int j=i;j<artikli.length-1;j++){
                    artikli[j]=artikli[j+1]
                }
            }
        }
        List<Integer> arrayList = IntStream.of(artikli).boxed().collect(Collectors.toList());
        arrayList.remove(artikli.length-1);
        artikli = arrayList.stream().mapToInt(Integer::intValue).toArray();

    }

    public double dajUkupnuCijenuArtikala(){
        double suma=0;
        for(int i=0;i<artikli.length;i++){
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }
}
