package Practicum_3A;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class VoetbalClubTest {

    private VoetbalClub NAC = new  VoetbalClub("",0,0,0);

    @BeforeEach

    public void init(){
        NAC = new  VoetbalClub("",0,0,0);
    }


    @Test
    void testClubnaam(){

        assertEquals("FC",NAC.getNaam());
    }

    @Test
    void aantalPunten() {

        NAC.setGewonnen(1);
        NAC.setGelijk(1);
        NAC.setVerloren(0);
        assertEquals(4,NAC.aantalPunten());

    }


    @Test
    void aantalGespeeld() {

        assertEquals(0,NAC.aantalGespeeld());
        NAC.setGewonnen(1);
        NAC.setGelijk(1);
        NAC.setVerloren(1);
        assertEquals(3,NAC.aantalGespeeld());



    }

    @Test
    void verwerkResultaat() {

        NAC.verwerkResultaat('w');

        NAC.verwerkResultaat('g');

        NAC.verwerkResultaat('v');

        assertEquals(4,NAC.aantalPunten());

        NAC.verwerkResultaat('l');
        assertEquals(4,NAC.aantalPunten());
    }
}