import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends Feline {

    @Mock
    Feline feline;
    Cat cat;

    @Before
    public void setup() {
        cat = new Cat(feline);
    }

    @Test
    public void catSoundTest() {
        String actualSound = cat.getSound();
        assertEquals("Мяу", actualSound);
    }

    @Test
    public void catFoodTest() throws Exception {
        List<String> mocList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(mocList);
        List<String> actualList = cat.getFood();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }
}
