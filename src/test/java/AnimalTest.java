import com.example.Animal;
import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testGetFamily() {
        Animal animal = new Feline();
        assertEquals("Кошачьи", animal.getFamily());
    }


    @Test
    public void testGetFoodForFeline() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Хищник";

        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood(animalKind));
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Травоядное";

        assertEquals(List.of("Трава", "Различные растения"), animal.getFood(animalKind));
    }
}


