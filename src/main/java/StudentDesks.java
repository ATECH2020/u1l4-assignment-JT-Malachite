import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int numStudentsA = scanner.nextInt();
        int numStudentsB = scanner.nextInt();
        int numStudentsC = scanner.nextInt();
        int numDesks;

        /*
         *  your code goes here
         */
        numDesks = (numStudentsA + numStudentsB + numStudentsC) / 2;
        System.out.print(numDesks);
 
        // closing the scanner object
        scanner.close();
    }
}