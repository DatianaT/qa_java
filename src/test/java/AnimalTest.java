import com.example.Animal;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String message = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(message, animal.getFamily());
    }
}


