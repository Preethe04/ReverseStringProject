import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    // Three positive test cases
    @Test void normalString() {
        assertEquals("olleh", ReverseString.reverse("hello"));
    }

    @Test void mixedCaseString() {
        assertEquals("avaJ", ReverseString.reverse("Java"));
    }

    @Test void stringWithSpaces() {
        assertEquals("dlroW olleH", ReverseString.reverse("Hello World"));
    }

    // One negative test case: invalid null input must be rejected
    @Test void nullInput() {
        assertThrows(IllegalArgumentException.class, () -> ReverseString.reverse(null));
    }
}
