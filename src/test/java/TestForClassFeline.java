import org.junit.Test;
import com.example.Feline;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestForClassFeline {
    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> mealList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(feline.eatMeat(), mealList);
    }

    @Test
    public void testGetFamilyReturnsCats() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
}