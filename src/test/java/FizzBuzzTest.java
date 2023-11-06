import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzbuzzTest_when1_thenReturn1() {
        //GIVEN
        int number = 1;

        //WHEN
        int actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals(1, actual);
    }
}
