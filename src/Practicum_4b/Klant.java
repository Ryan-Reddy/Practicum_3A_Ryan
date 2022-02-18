package Practicum_4b;

public class Klant {
    private String naam;
    private double kortingsPercentages;

    public Klant( String nm ) { naam = nm; }
    public void setKorting(double kP) { kortingsPercentages = kP; }
    public double getKorting() { return kortingsPercentages; }

    public String toString() {
        return naam + " (korting: " + kortingsPercentages +
                "%)";
    }
}
