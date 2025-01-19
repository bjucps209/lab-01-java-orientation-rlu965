import java.util.Scanner;


public class Guess {
    public static void main(String[] args) {
        int Guess_number = 0;
        int secretnumber = (int) (Math.random()*11);
        boolean gs = true;
        while (gs == true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter your guess: ");
            int guess = Integer.parseInt(scan.nextLine());
            if (guess < secretnumber) {
               System.out.println("Your guess is too low.");
               Guess_number += 1;
            } else if (guess > secretnumber) {
               System.out.println("Your guess is too high.");
               Guess_number += 1;
            } else {
               System.out.println("You got it!");
               break;
            }
        }
        System.out.println("It took you "+ Guess_number + " guesses.");
    }

}



        

    


    

