import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class LionParamForMaleTest {
    Lion lion;
    private String sex = "Самец";
    Feline feline;

    @Test
    public void doesHaveManeMaleLionTest() throws Exception
    {
        lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(true, hasMane);
    }
}
