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
//        if gehuurdeAuto
        return aantalDagen * 2;
//                gehuurdeAuto.getPrijsPerdag();
    }

    @Override
    public String toString() {
        if (gehuurdeAuto == null) {
            return
                "er is geen auto bekend" + "\n" +
                "op naam van: " + huurder + "\n" +
                "aantal dagen: " + aantalDagen + " en dat kost //{add pricecalc. someplace.} " + "\n" +
                "//  en dat kost 3150.0\t" + totaalPrijs(); }
        if (huurder == null) {
            return
                gehuurdeAuto + "\n" +
                "op naam van: " + "<onbekend>" + "\n" +
                "aantal dagen: " + aantalDagen + " en dat kost //{add pricecalc. someplace.} " + "\n" +
                "//  en dat kost 3150.0\t" + totaalPrijs(); }
        else {
            return
                gehuurdeAuto + "\n" +
                "op naam van: " + huurder + "\n" +
                "aantal dagen: " + aantalDagen + " en dat kost //{add pricecalc. someplace.} " + "\n" +
                "//  en dat kost 3150.0\t" + totaalPrijs();
        }
    }
}


//Let op: Bij het aanmaken van een AutoHuur-object is de multipliciteit van de beide associaties 0. Er moet


//Eerste autohuur:
//  er is geen auto bekend
//  er is geen huurder bekend
//  aantal dagen: 0 en dat kost 0.0
//
//Eerste autohuur:
//  er is geen auto bekend
//  op naam van: Mijnheer de Vries (korting: 10.0%)
//  aantal dagen: 0 en dat kost 0.0
//
//Eerste autohuur:
//  autotype: Peugeot 207 met prijs per dag: 50.0
//  op naam van: Mijnheer de Vries (korting: 10.0%)
//  aantal dagen: 4 en dat kost 180.0
//
//Tweede autohuur:
//  autotype: Ferrari met prijs per dag: 3500.0
//  op naam van: Mijnheer de Vries (korting: 10.0%)
//  aantal dagen: 1 en dat kost 3150.0
//
//Gehuurd: Peugeot 207 met prijs per dag: 50.0
//Gehuurd: Ferrari met prijs per dag: 3500.0