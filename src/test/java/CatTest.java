import com.example.Cat;
import com.example.Feline;
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

    @Test
    public void catSoundTest() {
        Cat cat = new Cat(feline);
        String actualSound = cat.getSound();
        assertEquals("Мяу", actualSound);
    }

    @Test
    public void catFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> mocList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(cat.getFood()).thenReturn(mocList);
        List<String> actualList = cat.getFood();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }

}
