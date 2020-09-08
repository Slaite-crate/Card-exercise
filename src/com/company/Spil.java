package com.company;

public class Spil {
    private Sæt sæt;
    private int spiller1;
    private int spiller2;

    public Spil() {
        sæt = new Sæt();
    }

    public void go() {
        while (sæt.sætSize() > 0) {
            Kort kort1 = sæt.draw();
            System.out.println("spiller1: " + kort1);
            Kort kort2 = sæt.draw();
            System.out.println("spiller2: " + kort2);
            if (kort1.compareTo(kort2) < 0) {
                spiller2++;
            } else if (kort2.compareTo(kort1) < 0) {
                spiller1++;
            } else {
                System.out.println("even steven");
                assert(kort1.compareTo(kort2) == 0);
            }
            System.out.println("spiller1 " + spiller1 + " - " + spiller2 + " spiller2");
            System.out.println();
        }
    }
}
