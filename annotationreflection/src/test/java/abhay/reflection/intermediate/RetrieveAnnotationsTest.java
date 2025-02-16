package abhay.reflection.intermediate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RetrieveAnnotationsTest {
    @Test
    void testRetrieveAnnotations() {
        assertEquals("John Doe", RetrieveAnnotations.getAuthor(DocumentedClass.class));
    }
}
