import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    Feline feline;
    int numberOfKittens = 5;
    @Test
    public void testGetKitten() {
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void testGetKittens(){
        int actualResult = feline.getKittens(numberOfKittens);
        assertEquals(numberOfKittens, actualResult);
    }
    @Test
    public void testGetFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void testEatMeat() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

}
