import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {

    PlayerCharacter playerCharacter = new PlayerCharacter();

    @Test
    void getX_expectZero() {
        int expected = 0;
        int actual = playerCharacter.getX();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getY_expectZero() {
        int expected = 0;
        int actual = playerCharacter.getY();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void moveW_expectYPlusOne() {
        playerCharacter.moveW();

        int expected = 1;
        int actual = playerCharacter.getY();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void moveS_expectYMinusOne() {
        playerCharacter.moveS();

        int expected = -1;
        int actual = playerCharacter.getY();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void moveA_expectXMinusOne() {
        playerCharacter.moveA();

        int expected = -1;
        int actual = playerCharacter.getX();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void moveD_expectXPlusOne() {
        playerCharacter.moveD();

        int expected = 1;
        int actual = playerCharacter.getX();

        Assertions.assertEquals(expected, actual);
    }
}
