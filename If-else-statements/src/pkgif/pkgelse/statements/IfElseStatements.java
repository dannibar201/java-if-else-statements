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
    }
        if (num % 5 == 0) {
            System.out.println("MULTIPLE OF 5");
        }
    

   
        else
        {
        
System.out.println("NOT A MULTIPLE OF 5");
    }

    public static void question5() {

    }

    public static void question6() {

    }

    public static void question7() {

    }

    public static void question8() {

    }

    public static void question9() {

    }

    public static void question10() {

    }

}
