package abhay.reflection.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MethodExecutionTimerTest {
    @Test
    void testExecutionTimeMeasurement() throws Exception {
        long executionTime = MethodExecutionTimer.measureExecutionTime(Task.class, "execute");
        assertTrue(executionTime > 0);
    }
}
