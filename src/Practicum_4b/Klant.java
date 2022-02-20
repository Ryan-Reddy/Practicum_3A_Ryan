package Practicum_4b;

public class Klant {
    private String naam;
    private double kortingsPercentages;

    public Klant( String nm )  {
            naam = nm;
        }


    public void setKorting(double kP) { kortingsPercentages = kP; }
    public double getKorting() { return kortingsPercentages; }

    public String getNaam(String nm) {
//        if (nm != null) {
            return naam;
//        } else {
//            return "no user";
//        }
    }

    public String toString() {
        return naam + " (korting: " + kortingsPercentages +
                "%)";
    }
}
