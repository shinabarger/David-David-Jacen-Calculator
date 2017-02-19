import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //CREATE A COMMENT
        Scanner scanner1 = new Scanner(System.in);
        String userOption1 = "";
        int userNumber1 = 0;
        int userNumber2 = 0;
        int total = 0;
        boolean isPrime = false;
        String userWantsToPlayAgain = "";


        while (true) {

            userOption1 = Validator.getCalculatorOption(scanner1, "This a calculator. \n Enter ADD to add numbers \n SUBTRACT to subtract numbers \n PRIME to see if your number is prime \n TIMES to multiply the numbers:  " );
            System.out.println("You entered: " + userOption1);

            if (userOption1.equalsIgnoreCase("add")) {
                System.out.println("Enter the 1st # you want to add: ");

                userNumber1 = scanner1.nextInt();
                System.out.println("Your 1st entered # is: " + userNumber1);

                System.out.println("Enter the 2nd # you want to add: ");
                userNumber2 = scanner1.nextInt();
                System.out.println("Your 1st entered # is: " + userNumber1);
                System.out.println("Your 2nd entered # is: " + userNumber2);

                total = userNumber1 + userNumber2;
                System.out.println("Total is: " + total);
            }

            if (userOption1.equalsIgnoreCase("subtract")) {
                System.out.println("Enter the 1st #: ");

                userNumber1 = scanner1.nextInt();
                System.out.println("Your entered # is: " + userNumber1);

                System.out.println("Enter the # you want to subtract from " + userNumber1);
                userNumber2 = scanner1.nextInt();

                System.out.println("Your 1st entered # is: " + userNumber1);
                System.out.println("Your 2nd entered # is: " + userNumber2);

                total = userNumber1 - userNumber2;
                System.out.println("Subtracted total is: " + total);
            }

            if (userOption1.equalsIgnoreCase("prime")) {
                System.out.println("Enter a number, please and thank you earligh in the morning sir: ");
                userNumber1 = scanner1.nextInt();

                isPrime(userNumber1);

            }

            if (userOption1.equalsIgnoreCase("Times")) {
                System.out.println("Enter the first number you want to multiply:");
                userNumber1 = scanner1.nextInt();
                System.out.println("Your 1st entered # is: " + userNumber1);

                System.out.println("Enter the 2nd # you want to multiply: ");
                userNumber2 = scanner1.nextInt();
                System.out.println("Your 1st entered # is: " + userNumber1);
                System.out.println("Your 2nd entered # is: " + userNumber2);

                total = userNumber1 * userNumber2;
                System.out.println("Total multiplied is: " + total);
            }


            System.out.println("Do you want to play again? Y / N :");
            userWantsToPlayAgain = scanner1.nextLine();
            userWantsToPlayAgain = scanner1.nextLine();

            if (userWantsToPlayAgain.equalsIgnoreCase("N")) {
                System.out.println("Thanks for playing! Have a great day! ");
                break;
            }
            if (userWantsToPlayAgain.equalsIgnoreCase("Y")) {
                continue;
            }

        }
    }
    public static boolean isPrime(int num) {
        if (num > 2 && num % 2 == 0) {
            System.out.println(num + " is not prime");
            return false;
        }
        int top = (int) Math.sqrt(num);
        for (int i = 3; i < top; i += 2) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                return false;
            }
        }
        System.out.println(num + " is prime");
        return true;
    }
}
