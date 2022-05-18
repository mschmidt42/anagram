
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Anagram Test")
class AppTest {

    @DisplayName("Main has a isAnagram method")
    @Test void appHasIsAnagramMethod() {
        Main classUnderTest = new Main();
        assertNotNull(classUnderTest.isAnagram("", ""), "app should have a isAnagram method");
    }

    @DisplayName("isAnagram(\"xyz\", \"tap\") => false")
    @Test void testIsAnagram_xyz_tap() {
        Main classUnderTest = new Main();
        assertFalse(classUnderTest.isAnagram("xyz", "tap"), "isAnagram(\"xyz\", \"tap\") should be false" );
    }

  @DisplayName("isAnagram(\"pat\", \"tap\") => true")
    @Test void testIsAnagram_pat_tap() {
        Main classUnderTest = new Main();
        assertTrue(classUnderTest.isAnagram("pat", "tap"), "isAnagram(\"pat\", \"tap\") should be true" );
    }

    @DisplayName("isAnagram(\"Aal\", \"All\") => false")
    @Test void testIsAnagram_Aal_All() {
        Main classUnderTest = new Main();
        assertFalse(classUnderTest.isAnagram("Aal", "All"), "isAnagram(\"Aal\", \"All\") should be false" );
    }

    @DisplayName("isAnagram(\"IAmLordVoldemort\", \"TomMarvoloRiddle\") => true")
    @Test void testIsAnagram_IAmLordVoldemort_TomMarvoloRiddle() {
        Main classUnderTest = new Main();
        assertTrue(classUnderTest.isAnagram("IAmLordVoldemort", "TomMarvoloRiddle"), "isAnagram(\"IAmLordVoldemort\", \"TomMarvoloRiddle\") should be true" );
    }

    @DisplayName("isAnagram(\"I Am Lord Voldemort\", \"Tom Marvolo Riddle\") => true")
    @Test void testIsAnagram_IAmLordVoldemort_TomMarvoloRiddle2() {
        Main classUnderTest = new Main();
        assertTrue(classUnderTest.isAnagram("I Am Lord Voldemort", "Tom Marvolo Riddle"), "isAnagram(\"I Am Lord Voldemort\", \"Tom Marvolo Riddle\") should be true" );
    }

    @DisplayName("isAnagram(\"Behoerdenbauten\", \"ohrenbetaeubend\") => true")
    @Test void testIsAnagram_Behoerdenbauten() {
        Main classUnderTest = new Main();
        assertTrue(classUnderTest.isAnagram("Behoerdenbauten", "ohrenbetaeubend"), "isAnagram(\"Behoerdenbauten\", \"ohrenbetaeubend\") should be true" );
    }


}
