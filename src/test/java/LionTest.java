import com.example.Lion;
import org.junit.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LionTest {

    @Test
    public void testHasManeMale() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue(lion.hasMane);
    }

    @Test
    public void testHasManeFemale() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse(lion.hasMane);
    }

    @Test
    public void testHasManeMessage(){
        Exception Exception = assertThrows(Exception.class, () ->{
            Lion lion = new Lion("Используйте допустимые значения пола животного - самец или самка");
        });

        String message = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(message, Exception.getMessage());
    }
}

