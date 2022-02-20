package Practicum_4b;

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
        } else if (aD <1) {
            throw new IllegalArgumentException("cannot be a negative period");
        } else {
            throw new IllegalArgumentException("aantal dagen does not exist");
        }
    }

    public void setHuurder(Klant hrd) {
        huurder = hrd;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public void setGehuurdeAuto(Auto gAuto) {
        gehuurdeAuto = gAuto;
    }

    public int getAantalDagen() {
        return aantalDagen;
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
        else if (gehuurdeAuto == null && huurder != null) {
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















