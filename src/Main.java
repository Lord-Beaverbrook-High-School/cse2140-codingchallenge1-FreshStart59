import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year");
        int year = myScan.nextInt();
        //Math section
        int digit = year % 10; //finds the lowest number
        year = year / 10; //removes the lowest number
        int digit2 = year % 10; //finds the new lowest number
        year = year / 10; //removes the lowest number
        int digit3 = year % 10; //finds the new lowest number
        year = year / 10; //removes the lowest number
        //Year is used as digit4 because it always has the last number if 4 numbers are submitted

        //numbers printing section
        //Prints the digits in opposite order so that it is the correct sequence
        System.out.println(year);
        System.out.println(digit3);
        System.out.println(digit2);
        System.out.println(digit);
    }

}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran
/*
Test 1
Enter a 4 digit year
1989
1
9
8
9

Process finished with exit code 0
Test 2
1344
1
3
4
4

Process finished with exit code 0
Test 3
Enter a 4 digit year
790345
790
3
4
5

Process finished with exit code 0
Test 4
Enter a 4 digit year
nine
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	at Main.main(Main.java:7)

Process finished with exit code 1
*/