import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterLionTest {

    private final String checkedText;
    private final boolean expected;

    public ParameterLionTest(String checkedText, boolean expected) {
        this.checkedText = checkedText;
        this.expected = expected;
    }

    Feline feline = new Feline();

    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void shouldCheckMane() throws Exception {
        Lion lion = new Lion(checkedText, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
