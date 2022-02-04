import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    @Test
    public void multiplyTest() {
        assertEquals(2, Demo.multiply(1, 1));
    }
}
