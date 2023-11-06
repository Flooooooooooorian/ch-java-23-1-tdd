import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzbuzzTest_when1_thenReturn1() {
        //GIVEN
        int number = 1;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals("1", actual);
    }


    @Test
    void fizzBuzzTest_when2_thenReturn2() {
        //GIVEN
        int number = 2;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals("2", actual);
    }


    @Test
    void fizzBuzzTest_when3_thenReturnFizz() {
        //GIVEN
        int number = 3;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals("Fizz", actual);
    }

    @Test
    void fizzBuzzTest_when5_thenReturnBuzz() {
        //GIVEN

        int number = 5;

        //WHEN
        String actual = FizzBuzz.fizzBuzz(number);

        //THEN
        assertEquals("Buzz", actual);
    }
}
