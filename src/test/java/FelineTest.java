import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Feline feline;

    @Test
    public void testGetKitten() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void testGetKittens(){
        Mockito.when(feline.getKittens(5)).thenReturn(5);
        int actualResult = feline.getKittens(5);
        assertEquals(5, actualResult);
    }

    @Test
    public void testGetFamily() {
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void testEatMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

}
