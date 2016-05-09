/**
 * Created by Tornike on 09.05.2016.
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonaciTest {
    @Test
    public void test_get_method(){
        Fibonaci f = new Fibonaci();
        assertEquals(f.get(2), 2);
        assertEquals(f.get(3), 3);
        assertEquals(f.get(4), 5);
        assertEquals(f.get(5), 8);
    }
}
