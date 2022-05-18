
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

@DisplayName("Paremeter Test")
class AdvancedTest {

	@DisplayName("isAnagram(null, \"tap\") => false")
    @Test void testIsAnagram_null_tap() {
        Main classUnderTest = new Main();
        assertFalse(classUnderTest.isAnagram(null, "tap"), "isAnagram(null, \"tap\") should be false" );
    }

	@DisplayName("isAnagram(\"pat\", null) => false")
    @Test void testIsAnagram_pat_null() {
        Main classUnderTest = new Main();
        assertFalse(classUnderTest.isAnagram("pat", null), "isAnagram(\"pat\", null) should be false" );
    }

	@DisplayName("isAnagram(null, null) => false")
    @Test void testIsAnagram_null_null() {
        Main classUnderTest = new Main();
        assertFalse(classUnderTest.isAnagram(null, null), "isAnagram(null, null) should be false" );
    }

}
