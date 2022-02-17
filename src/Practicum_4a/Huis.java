package Practicum_4a;

public class Huis {
    private String adres;
    private int bouwjaar;
    private Persoon huisbaas;

    public Huis (String adr, int bwj) {
        adres = adr;
        bouwjaar = bwj;
    }

    public void setAdres (String adr) { adres = adr; }
    public void setBouwjaar (int bwj) { bouwjaar = bwj; }

    public String getAdres () { return adres; }
    public int getBouwjaar () { return bouwjaar; }

    public void setHuisbaas (Persoon p) {
         huisbaas = p;
    }
    public Persoon getHuisbaas () {
        return huisbaas;
    }
    public String toString() {
       String info = "Huis" +
                adres + "is gebouwd in " +
                " bouwjaar " + bouwjaar +
                " en heeft huisbaas " + huisbaas;
        return info;
    }
}
