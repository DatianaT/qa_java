import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @InjectMocks
    private Cat cat;


    @Test
    public void testGetSound() throws Exception {
        // Задаем поведение мока: при вызове eatMeat() возвращать пустой список
        Mockito.when(feline.eatMeat()).thenReturn(List.of());
        List<String> foodList = cat.getFood();
        assertEquals("Мяу", cat.getSound());
    }
    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Травоядное";

        assertEquals(List.of("Трава", "Различные растения"), animal.getFood(animalKind));
    }

    @Test
    public void testGetFoodPredator() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Хищник";

        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood(animalKind));
    }

    @Test
    public void testGetFoodWithMock() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> food = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }
}

