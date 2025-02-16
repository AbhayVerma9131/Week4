package abhay.reflection.advanced;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

public class ObjectMapperTest {
    @Test
    void testObjectMapper() throws Exception {
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 30);

        User user = ObjectMapper.toObject(User.class, properties);
        assertEquals("John Doe", user.getName());
        assertEquals(30, user.getAge());
    }
}
