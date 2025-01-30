import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {
    @Test
    void getX_expectZero() {
        int expected = 0;
        int actual = PlayerCharacter.getX();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getY_expectZero() {
        int expected = 0;
        int actual = PlayerCharacter.getY();

        Assertions.assertEquals(expected, actual);
    }
}
