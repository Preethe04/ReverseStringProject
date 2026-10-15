import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    // Positive Test Case 1 - Intentionally failing
    @Test
    void normalString() {
        assertEquals("hello",
            ReverseString.reverse("hello"));
    }

    // Positive Test Case 2
    @Test
    void mixedCaseString() {
        assertEquals("avaJ",
            ReverseString.reverse("Java"));
    }

    // Positive Test Case 3
    @Test
    void stringWithSpaces() {
        assertEquals("dlroW olleH",
            ReverseString.reverse("Hello World"));
    }

    // Negative Test Case 4
    @Test
    void nullInput() {
        assertThrows(
            IllegalArgumentException.class,
            () -> ReverseString.reverse(null)
        );
    }
}