import com.example.Feline;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {
    private String animalKind;
    private boolean expected;

    public FelineTest(String animalKind, boolean expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[] isDomesticated(){
        return new Object[][]{
                {"Лев", false},
                {"Тигр", false},
                {"Домашняя кошка", true},
        };
    }
    @Test
    public void testIsDomesticated() {
        Feline feline = new Feline();
        assertEquals(expected, feline.isDomesticated(animalKind));
    }
    @Test
    public void testGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetKittens() throws Exception {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}
