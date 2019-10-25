package pkgif.pkgelse.statements;

// Import Scanner Here
import java.util.Scanner;

/**
 *
 * Name: Period: Project Name:
 *
 *
 */
public class IfElseStatements {

    // Create Scanner Object here So it may be used in all methods
    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        // Happy Coding!

        question1();
        //Invoke the methods here 

    }

    public static void question1() {
        System.out.println("Enter your grade to see if you passed or failed the exam!");
        int num = kb.nextInt();

        if (num >= 70) {
            System.out.println("You have PASSED");
        } else {
            System.out.println("You have... Failed :-{");
        }
    }

    public static void question2() {
        System.out.println("Enter a number");
        int num = kb.nextInt();

        if (num <= 50) {
            System.out.println("GO");
        } else {
            System.out.println("STOP");
        }
    }

    public static void question3() {
        System.out.println("Enter a number");
        int num = kb.nextInt();

        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void question4() {
        System.out.println("Enter a number");
        int num = kb.nextInt();

        if (num % 5 == 0) {
            System.out.println("Multiple of 5");
        } else {
            System.out.println("Not a multiple of 5");
        }
    }

    public static void question5() {
        System.out.println("Enter a number");
        int num = kb.nextInt();

        if (num < 10) {
            System.out.println("One digit");
        }
        if (num > 100) {
            System.out.println("Three digits");
        } else {
            System.out.println("Not a multiple of 5");
        }
    }

    public static void question6() {
        System.out.println("Enter jersey number");
        int num = kb.nextInt();

        if (num == 12 || num == 71 || num == 80) {
            System.out.println("That jersey is retired from the Seattle Seahawks");
        }

    }

    public static void question7() {

        System.out.println("Name a state");
        String state = kb.nextLine();

        if (state.equalsIgnoreCase("Washington")
                || state.equalsIgnoreCase("Idaho")
                || state.equalsIgnoreCase("Oregon")) {
            System.out.println("This state is in the PNW");
        } else {
            System.out.println("You should move to the PNW; it's great here!");
        }

    }

    public static void question8() {
        System.out.println("What size iced coffee would you like?");
        String size = kb.nextLine();
        if (size.equalsIgnoreCase("Short")) {
            System.out.println("This size has 8 ounces");
        } else if (size.equalsIgnoreCase("Tall")) {
            System.out.println("This size has 12 ounces");
        } else if (size.equalsIgnoreCase("Grande")) {
            System.out.println("This size has 16 ounces");
        } else if (size.equalsIgnoreCase("Venti")) {
            System.out.println("This size has 20 ounces");
        }
    }

    public static void question9() {
        
        double grosspay = 0;
        
        System.out.println("What is your rate of pay");
        int pay = kb.nextInt();
        System.out.println("time");
        int time = kb.nextInt();

        if (time > 40)
        {
            grosspay = 40 * pay;
            grosspay += (time - 40) + (pay * 1.5);
        }
        else
        {
         grosspay = 40 * time;   
        }
    }

    public static void question10() {

    }

}
