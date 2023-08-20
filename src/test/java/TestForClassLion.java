import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class TestForClassLion {
    @Mock
    Feline feline;
    @Test
    public void testDoesHaveManeTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean result = lion.doesHaveMane();
        assertTrue(result);
    }
    @Test
    public void testDoesHaveManeFalse() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean result = lion.doesHaveMane();
        assertFalse(result);
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int kittens = lion.getKittens();
        assertEquals(1, kittens);
    }


    @Test
    public void testGetFood () throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, lion.getFood());
    }

}