import com.example.Feline;
import org.junit.runner.RunWith;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestForClassFelineCountKitten {
    private final int expectedResult;
    private final int actualResult;
    Feline feline = new Feline();

    public TestForClassFelineCountKitten (int expectedResult, int countOfKittens) {
        this.expectedResult = expectedResult;
        actualResult = countOfKittens;
    }
    @Parameterized.Parameters ()
    public static Object[][] testValues() {
        return new Object[][]{
                {0, 0},
                {1, 1},
        };
    }
    @Test
    public void testGetKittens () {
        assertEquals("Фактическое количество маленьких кошек не совпадает с ожиданием",
                expectedResult, feline.getKittens(actualResult));
    }
}