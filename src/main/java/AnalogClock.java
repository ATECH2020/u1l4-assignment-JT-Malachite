import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        //Reads ints from user
        int hours = scanner.nextInt();
        int mins;

        /*
         *  your code goes here
         */
        mins = (hours % 30) * 12;
        System.out.println(mins);
        // closing the scanner object
        scanner.close();
    }
}