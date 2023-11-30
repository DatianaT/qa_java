import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    private int numberOfKittens = 5;
    private boolean expectedResult = true;
    public FelineTest(int numberOfKittens, boolean expectedResult) {
        this.numberOfKittens = numberOfKittens;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Collection<Object[]> getKittens() {
        return Arrays.asList(new Object[][]{
                {3, false},
                {9, false},
                {1, true},
        });
    }
    @Test
    public void testGetKittens() {
    }
    @Test
    public void testSecondGetKittens(){
        Feline feline = new Feline();
        int expectedResult = feline.getKittens(numberOfKittens);
        assertEquals(numberOfKittens, expectedResult);
    }
    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

}
