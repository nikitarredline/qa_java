import com.example.Alex;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {

    Alex alex;

    @Before
    public void setup() throws Exception {
        alex = new Alex();
    }

    @Test
    public void kittensTest() {
        int kittens = alex.getKittens();
        assertEquals(0, kittens);
    }

    @Test
    public void friendsTest() {
        List<String> actualList = alex.getFriends();
        List<String> expectedList = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void placeOfLivengTest() {
        String livePlace = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский Зоопарк", livePlace);
    }
}
