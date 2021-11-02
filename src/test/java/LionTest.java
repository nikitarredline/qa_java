import com.example.Feline;
import com.example.Lion;
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
public class LionTest {

    @Mock
    Feline feline;
    Lion lion;

    @Before
    public void setup() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void lionFoodTest() throws Exception {
        List<String> mocList = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(lion.eatMeat()).thenReturn(mocList);
        List<String> actualList = lion.eatMeat();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void kittenLionTest() {
        int kittensCount = lion.getKittens(1);
        assertEquals(1, kittensCount);
    }
}
