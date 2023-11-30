import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;
    @Test
    public void testGetKittensLion() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(5);
        int actualResult = lion.getKittens();
        assertEquals(5, actualResult);
    }
    @Test
    public void testGetKittensLionFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(9);
        int actualResult = lion.getKittens();
        assertEquals(9, actualResult);
    }
    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }
    @Test
    public void testHasManeFemale() throws Exception {
        Lion lion = new Lion("Самка", new Feline());
        assertFalse(lion.doesHaveMane());
    }
    @Test
    public void testHasManeMessage(){
        String message = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = assertThrows(Exception.class, () ->{
            Lion lion = new Lion(message, new Feline());
        });
        assertEquals(message, exception.getMessage());
    }
    @Test
    public void testGetFoodForFeline() throws Exception {
        Animal animal = new Animal();
        String animalKind = "Хищник";

        assertEquals(List.of("Животные", "Птицы", "Рыба"), animal.getFood(animalKind));
    }
    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> foodList = lion.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), foodList);
    }


}

