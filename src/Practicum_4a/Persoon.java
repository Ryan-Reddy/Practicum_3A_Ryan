package Practicum_4a;

public class Persoon {
    private String naam;
    private int leeftijd;

    public Persoon(String nm, int lft) {
        naam = nm;
        leeftijd = lft;
    }

    public void setNaam(String nm) {
        naam = nm;
    }

    public void setLeeftijd(int lft) {
        leeftijd = lft;
    }

    public String getNaam() {
        return naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String toString() {
        return naam + "; leeftijd " + leeftijd + " jaar.";
    }
}
