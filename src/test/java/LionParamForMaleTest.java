import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamForMaleTest {
    Lion lion;
    Feline feline;

    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameter(1)
    public boolean sexTest;

    @Parameterized.Parameters()
    public static Object[][] data()
    {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeMaleLionTest() throws Exception
    {
        lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals(sexTest, hasMane);
    }
}