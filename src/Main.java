public class Main {
    public static void main(String[] args) {
        int fizzNumber = 3;
        int buzzNumber = 5;

        for(int i = 1 ; i <= 100 ; i++){
            if(i % (fizzNumber * buzzNumber) == 0)
                System.out.println("FizzBuzz");

            else if(i % fizzNumber == 0)
                System.out.println("Fizz");

            else if(i % buzzNumber == 0)
                System.out.println("Buzz");

            if(i % fizzNumber != 0 && i % buzzNumber != 0)
                System.out.println(i);
        }
    }
}