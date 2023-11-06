public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("Hello");
    }


    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
