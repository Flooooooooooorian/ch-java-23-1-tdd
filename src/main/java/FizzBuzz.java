public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello");
    }


    public static String fizzBuzz(int number) {
        String result;

        if (number % 3 == 0) {
            result = "Fizz";
        }
        else {
            return String.valueOf(number);
        }

        return result;
    }
}
