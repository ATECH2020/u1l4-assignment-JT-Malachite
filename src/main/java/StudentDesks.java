import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int numStudentsA = scanner.nextInt();
        int numStudentsB = scanner.nextInt();
        int numStudentsC = scanner.nextInt();
        int numDesk1, numDesk2, numDesk3;
        int totalDesks;
        /*
         *  your code goes here
         */
        numDesk1 = (numStudentsA + 1) / 2;
        numDesk2 = (numStudentsB + 1) / 2;
        numDesk3 = (numStudentsC + 1) / 2;
        totalDesks = numDesk1 + numDesk2 + numDesk3;
        System.out.print(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}