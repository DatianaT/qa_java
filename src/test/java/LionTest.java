import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTest {
    private Lion lion;
    @Mock
    Feline feline;
    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public int lionExpectedKittens;
    @Parameterized.Parameters()
    public static Object[][] data()
    {
        return new Object[][]{
                {"Самец", 1},
                {"Самка", 9}
        };
    }
    @Before
    public void setUp()
    {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetKittensLine() throws Exception {
        lion = new Lion(sex, feline);
        Mockito.when(feline.getKittens()).thenReturn(lionExpectedKittens);
        int actualResult = lion.getKittens();
        assertEquals(lionExpectedKittens, actualResult);
    }
    @Test
    public void testHasManeMessage(){
        String message = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () ->{
            lion = new Lion(message, new Feline());
        });
        assertEquals(message, exception.getMessage());
    }
    @Test
    public void testGetFood() throws Exception {
        lion = new Lion(sex, feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> foodList = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList);
    }
}

