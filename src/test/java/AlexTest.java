import com.example.Alex;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AlexTest {

    @Test
    public void kittensTest() throws Exception {
        Alex alex = new Alex();
        int kittens = alex.getKittens();
        assertEquals(0, kittens);
    }

    @Test
    public void friendsTest() throws Exception {
        Alex alex = new Alex();
        List<String> actualList = alex.getFriends();
        List<String> expectedList = Arrays.asList("Марти", "Глория", "Мелман");
        assertEquals(expectedList, actualList);
    }

    @Test
    public void placeOfLivengTest() throws Exception {
        Alex alex = new Alex();
        String livePlace = alex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский Зоопарк", livePlace);
    }
}
