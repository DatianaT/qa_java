import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    @Test
    public void testEatMeat() throws Exception{
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        Assert.assertNotNull(food);
        Assert.assertFalse(food.isEmpty());
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        String family = feline.getFamily();
        Assert.assertEquals("Кошачьи", family);
    }

    @Test
    public void testGetKitten() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens();
        Assert.assertEquals(1, kittensCount);
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        int kittensCount = feline.getKittens(3);
        Assert.assertEquals(3, kittensCount);
    }
}
