package Practicum_4b;

public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prPD) {
        type = tp;
        prijsPerDag = prPD;
    }

    public void setPrijsPerDag(double prPD) {
        prijsPerDag = prPD;
    }

    public double getPrijsPerdag() {
        return prijsPerDag;
    }


    public String toString() {
        if (type != null) {
            return "autotype: " + type + " met prijs per dag: " + prijsPerDag;
        } else {
            return "Er is geen auto bekend.";
//does not find this, if there is no instance.
        }
    }
}

