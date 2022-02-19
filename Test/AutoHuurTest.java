import Practicum_4b.AutoHuur;
import Practicum_4b.Klant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private AutoHuur AH;
    @BeforeEach
    void init() {
//        System.out.println("__init__");
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
//        TODO: write no negative
    }

    @Test
    void setHuurder() {
//        System.out.println("setHuurder Test");
//        Klant k = new Klant("Harry");
//        assertEquals("Harry", k.getNaam());
    }

    @Test
    void setGehuurdeAuto() {

    }

    @Test
    void getAantalDagen() {
        System.out.println("getAantalDagen Test");
        AH.setAantalDagen(10);
        assertEquals(10,AH.getAantalDagen());
    }

    @Test
    void getHuurder() {
    }

    @Test
    void getGehuurdeAuto() {
    }

    @Test
    void totaalPrijs() {
    }

    @Test
    void testToString() {
    }
}