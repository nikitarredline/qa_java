import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterAnimalTest {

    private final String checkedText;
    private final List<String> expected;

    public ParameterAnimalTest(String checkedText, List<String> expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void shouldCheckMane() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(checkedText);
        assertEquals(expected, actual);
    }
}
