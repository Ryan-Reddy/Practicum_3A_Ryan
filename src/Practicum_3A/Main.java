package Practicum_3A;

public class Main {
  public static void main(String[] args) {
    VoetbalClub ajx = new VoetbalClub("Ajax      ", 0, 0, 0);
    VoetbalClub feij = new VoetbalClub("Feijenoord", 0, 0, 0);
    VoetbalClub empty = new VoetbalClub("",0,0,0);

    System.out.println(empty);
    System.out.println("start");

    feij.verwerkResultaat('w');
    feij.verwerkResultaat('w');
    feij.verwerkResultaat('w');
    feij.verwerkResultaat('g');

//    ajx.verwerkResultaat('w');
//    ajx.verwerkResultaat('w');
//    ajx.verwerkResultaat('w');
//    ajx.verwerkResultaat('w');

    System.out.println("Feijenoord punten: " + feij.aantalPunten());
    System.out.println("Ajax gespeeld: " + ajx.aantalGespeeld());
    System.out.println();

    System.out.println(ajx);
    System.out.println(feij);
  }
}