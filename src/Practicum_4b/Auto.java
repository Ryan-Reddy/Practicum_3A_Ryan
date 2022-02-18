package Practicum_4b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto ( String tp, double prPD) {
        type = tp;
        prijsPerDag = prPD;
    }
    public void setPrijsPerDag( double prPD ) { prijsPerDag = prPD; }
    public double setPrijsPerdag() { return prijsPerDag; }

    public String toString() {
        return type + " met prijs per dag: " + prijsPerDag;
    }
}
