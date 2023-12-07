import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.*;

public class LionParamForFemaleTest {
    Feline feline;
    private String sex = "Самка";

    @Test
    public void doesHaveFemaleLionTest() throws Exception
    {
        Lion lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        assertFalse(hasMane);
    }


}
