package abhay.reflection.advanced;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggingProxyTest {
    @Test
    void testProxyLogging() {
        Greeting greeting = (Greeting) LoggingProxy.createProxy(new GreetingImpl());
        assertDoesNotThrow(greeting::sayHello);
    }
}
