import Practicum_4b.Auto;
import Practicum_4b.AutoHuur;
import Practicum_4b.Klant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur AH;
    @BeforeEach
    void init() {
        System.out.println("__init__");
        AH = new AutoHuur();
    }

    @Test
    void autoHuur() {
    }

    @Test
    void getAantalDagenNegatief() {
        System.out.println("getAantalDagenNegatief Test");
        AH.setAantalDagen(-10);
        assertEquals(0,AH.getAantalDagen());
    }

    @Test
    void setHuurder() {
        System.out.println("setHuurder Test");
        Klant k = new Klant("Harry");
        AH.setHuurder(k);
        assertEquals(k, AH.getHuurder());
    }

    @Test
    void getHuurder() {
            Klant k = new Klant("TestHuurder");
            k.setKorting(10.0);
            AH.setHuurder(k);
            System.out.println(AH.getHuurder());
            assertEquals(k,AH.getHuurder());
    }

    @Test
    void setGehuurdeAuto() {
        System.out.println("setGehuurdeAuto Test");
        Auto a1 = new Auto("Rover", 100);
        AH.setGehuurdeAuto(a1);
        System.out.println(AH.getGehuurdeAuto());
    }

    @Test
    void getAantalDagen() {
        System.out.println("getAantalDagen Test");
        AH.setAantalDagen(10);
        assertEquals(10, AH.getAantalDagen());
    }

    @Test
    void getGehuurdeAuto() {
        Auto V = new Auto("Borealis 1221", 10);
        AH.setGehuurdeAuto(V);
        assertEquals(V,AH.getGehuurdeAuto());
    }

    @Test
    void totaalPrijs() {
        System.out.println("setGehuurdeAuto Test");
        Klant k = new Klant("Mijnheer de Vries");
        Auto a1 = new Auto("Rover", 100);
        k.setKorting(10.0);
        AH.setHuurder(k);
        AH.setGehuurdeAuto(a1);
        AH.setAantalDagen(4);
        AH.setGehuurdeAuto(a1);
        System.out.println("getPrijsperdag: " + (AH.getGehuurdeAuto()).getPrijsPerdag());

    }

    @Test
    void testToString() {
        assertEquals(AH,AH);
    }
}