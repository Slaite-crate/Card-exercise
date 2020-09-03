package com.company;

public class Kort {
    private final String tegn;
    private final int nummer;

    public Kort(String tegn, int nummer){
        this.tegn = tegn;
        this.nummer = nummer;
    }

    public String getTegn() {
        return tegn;
    }

    public int getNummer() {
        return nummer;
    }

    @Override
    public String toString() {
        return tegn + " " + nummer;
    }
}
