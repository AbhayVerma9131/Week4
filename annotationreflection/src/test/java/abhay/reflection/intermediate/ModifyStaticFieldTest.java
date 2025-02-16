package abhay.reflection.intermediate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModifyStaticFieldTest {
    @Test
    void testModifyStaticField() throws Exception {
        ModifyStaticField.modifyApiKey("UPDATED_KEY");
        assertEquals("UPDATED_KEY", Configuration.getApiKey());
    }
}
