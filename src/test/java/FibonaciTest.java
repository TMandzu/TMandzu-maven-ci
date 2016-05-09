/**
 * Created by Tornike on 09.05.2016.
 */
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class FibonaciTest {
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test_get_method(){
        Fibonaci f = new Fibonaci();
        assertEquals(f.get(2), 2);
        assertEquals(f.get(3), 3);
        assertEquals(f.get(4), 5);
        assertEquals(f.get(5), 8);

        f = Mockito.mock(Fibonaci.class);
        when(f.get(4)).thenReturn(4);
        when(f.get(5)).thenReturn(5);
        assertEquals(f.get(4), 4);
        assertEquals(f.get(5), 5);
    }
}
