package Practicum_3A;


public class VoetbalClub {
    private String naam;
    private Integer gewonnen;
    private Integer verloren;
    private Integer gelijk;

//    public Voetbalclub(String nm) {
//        naam = nm;
//    }

    public VoetbalClub(String nm, Integer gw, Integer ver, Integer gel) {

        if(nm == null || nm.isEmpty())
            naam = "FC";
        else
            naam = nm;

        gewonnen = gw;
        verloren = ver;
        gelijk = gel;


    }

    public void setNaam(String nm) {naam = nm; }
    public void setGewonnen(Integer gew) {
        gewonnen = gew;}
    public void setVerloren(Integer ver) {
        verloren = ver;}
    public void setGelijk(Integer gel) {
        gelijk = gel;}

    public String getNaam() { return naam; }
    public Integer getGewonnen() { return gewonnen;}
    public Integer getVerloren() { return verloren;}
    public Integer getGelijk() { return gelijk;}

    public Integer aantalPunten() {
        return (gewonnen *3)+(gelijk);    }
    public Integer aantalGelijk() {
        return gelijk;    }
    public Integer aantalGespeeld() {
            return gelijk+gewonnen+verloren;    }


    public void verwerkResultaat(char ch) {

        if (ch == 'w')
            gewonnen = gewonnen + 1;
        else if (ch == 'g')
            gelijk = gelijk + 1;
        else if (ch == 'v')
            verloren = verloren + 1;
            // foutieve input handelen
        else  System.out.println("ongeldig intoetsing");

    }
    public String toString() {
        String s = naam + " " + aantalGespeeld() + " " + gewonnen + " " + gelijk + " " + verloren + " " + aantalPunten();
        return s;
    }


}