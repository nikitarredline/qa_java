import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionFoodTest {

    @Mock
    Feline feline;

    @Test
    public void lionFoodTest() throws Exception {
        Lion lion = new Lion(feline);
        List<String> mocList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(lion.eatMeat()).thenReturn(mocList);
        List<String> actualList = lion.eatMeat();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }
}
