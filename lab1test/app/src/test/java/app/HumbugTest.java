package app;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class HumbugTest
{  
    @Test
    public void Max70_Constructor_ValidArgs_NoThrow()  {
        Humbug bug = new Humbug(5, "growl");
        assertEquals("growl", bug.getName());
        assertEquals(5, bug.getSize());
    }

    @Test
    public void Max70_Constructor_InvalidSize_Throws()
    {
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Humbug(-5, "growl"));
        assertTrue(e.getMessage().contains("Invalid size."));
    }

    @Test
    public void Max70_GetNumHumbugs_Works()
    {
        Humbug.numHumbugs = 0;
        Humbug bug = new Humbug(3, "Lady");
        Humbug bug2 = new Humbug(3, "Bug");

        assertEquals(2, Humbug.getNumHumbugs());
    }

    @Test
    public void Max85_Speak_Works()
    {
        Humbug bug = new Humbug(2, "growl");
        String result = bug.speak();
        assertEquals("growlgrowl", result);
    }


    @Test
    public void Max85_FindLargest_Works()
    {
        int result = Humbug.findLargest(new int[] { 5, 10, 3, 2, 6 } );
        assertEquals(10, result);
    }


    @Test
    public void Max100_GetVowels_Works()
    {
        ArrayList<String> result = Humbug.getVowels("a cat ate my hat");
        String vowels = String.join(",", result);
        assertEquals("a,a,a,e,a", vowels);
    } 

    @Test
    public void Max100_CheckSum_Works()
    {
        int result = Humbug.checksum("ABC");
        assertEquals(198, result);
    }
}