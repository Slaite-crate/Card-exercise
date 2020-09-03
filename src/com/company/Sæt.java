package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sæt implements Comparator<Kort> {
    private ArrayList<Kort> sæt;

    public Sæt() {
        sæt = new ArrayList<>();
        for (int i = 1; i <= 13; i++){
            sæt.add(new Kort("klør", i));
        }
        for (int i = 1; i <= 13; i++){
            sæt.add(new Kort("ruder", i));
        }
        for (int i = 1; i <= 13; i++){
            sæt.add(new Kort("hjerter", i));
        }
        for (int i = 1; i <= 13; i++){
            sæt.add(new Kort("spar", i));
        }
        Collections.shuffle(sæt);
    }

    public int sætSize(){
        return sæt.size();
    }

    public Kort draw(){
        Kort kort;
        kort = sæt.get(sæt.size()-1);
        sæt.remove(sæt.size()-1);
        return kort;
    }

    @Override
    public int compare(Kort o1, Kort o2) {
        if (o1.getNummer() < o2.getNummer()) return -1;
        if (o1.getNummer() > o2.getNummer()) return 1;
        else return 0;
    }
}
