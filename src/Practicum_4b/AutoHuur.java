package Practicum_4b;

import org.w3c.dom.ls.LSOutput;

public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public void AutoHuur(int aD, Klant hrd, Auto gAuto) {
        aantalDagen = aD;
        huurder = hrd;
        gehuurdeAuto = gAuto;
    }


    public void setAantalDagen(int aD) {
        if (aD > 0) {
            aantalDagen = aD;
        } else {
            throw new IllegalArgumentException("cannot be a negative period");
        }
    }

    public void setHuurder(Klant hrd) {
        huurder = hrd;
    }


    public void setGehuurdeAuto(Auto gAuto) {
        gehuurdeAuto = gAuto;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public Klant getHuurder() {
        return huurder;
    }


    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;        // moet beveiligd tegen gehuurdeAuto == null
    }

    public double totaalPrijs() {
        double info = (aantalDagen * (gehuurdeAuto.getPrijsPerdag() * (1 - huurder.getKorting()/100)));
        return info;
    }

    @Override
    public String toString() {
        if (gehuurdeAuto == null && huurder == null) {
            return
                "er is geen auto bekend" + "\n" +
                "er is geen huurder bekend" + "\n" +
                "aantal dagen: " + aantalDagen + " en dat kost 0";
        }
        if (gehuurdeAuto == null && huurder != null) {
            return
                "er is geen auto bekend" + "\n" +
                "op naam van: " + huurder + "\n" +
                "aantal dagen: " + aantalDagen; }

        if (gehuurdeAuto != null && huurder == null) {
            return
                gehuurdeAuto + "\n" +
                "er is geen huurder bekend" + "\n" +
                "aantal dagen: " + aantalDagen + " en dat kost 0"; }
        else {
            return
                gehuurdeAuto + "\n" +
                "op naam van: " + huurder + "\n" +
                "aantal dagen: " + aantalDagen +"\nvoor een totaalprijs: " + totaalPrijs();
        }
    }
}















