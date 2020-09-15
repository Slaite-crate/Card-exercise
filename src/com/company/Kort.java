package com.company;

public class Kort implements Comparable<Kort> {
    private final Tegn tegn;
    private final Nummer nummer;

    public Kort(Tegn tegn, Nummer nummer) {
        this.tegn = tegn;
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return tegn + " " + nummer;
    }

    @Override
    public int compareTo(Kort o) {
        if (this.nummer != o.nummer) {
            return this.nummer.compareTo(o.nummer);
        } else {
            return this.tegn.compareTo(o.tegn);
        }
    }
}