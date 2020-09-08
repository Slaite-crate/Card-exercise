package com.company;

import java.util.Collections;
import java.util.Stack;

public class Sæt {
    private Stack<Kort> sæt;

    public Sæt() {
        sæt = new Stack<>();
        for (Tegn t : Tegn.values()){
            for (Nummer n : Nummer.values()){
                sæt.push(new Kort(t,n));
            }
        }
        Collections.shuffle(sæt);
    }

    public int sætSize(){
        return sæt.size();
    }

    public Kort draw(){
        Kort kort;
        kort = sæt.pop();
        return kort;
    }

}
