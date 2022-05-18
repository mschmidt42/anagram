
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test void appHasIsAnagramMethod() {
        Main classUnderTest = new Main();
        assertNotNull(classUnderTest.isAnagram("", ""), "app should have a isAnagram method");
    }

    @Test void testIsAnagram_xyz_tap() {
        Main classUnderTest = new Main();
        assertFalse(classUnderTest.isAnagram("xyz", "tap"), "isAnagram(\"xyz\", \"tap\") should be false" );
    }

    @Test void testIsAnagram_pat_tap() {
        Main classUnderTest = new Main();
        assertTrue(classUnderTest.isAnagram("pat", "tap"), "isAnagram(\"pat\", \"tap\") should be true" );
    }

    @Test void testIsAnagram_Aal_All() {
        Main classUnderTest = new Main();
        assertFalse(classUnderTest.isAnagram("Aal", "All"), "isAnagram(\"Aal\", \"All\") should be false" );
    }

    @Test void testIsAnagram_IAmLordVoldemort_TomMarvoloRiddle() {
        Main classUnderTest = new Main();
        assertTrue(classUnderTest.isAnagram("IAmLordVoldemort", "TomMarvoloRiddle"), "isAnagram(\"IAmLordVoldemort\", \"TomMarvoloRiddle\") should be true" );
    }
}
