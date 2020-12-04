import java.util.Scanner;

class Game{
    public void play(User user, Computer cmp){

        Scanner input = new Scanner(System.in);
        Scanner roundNum = new Scanner(System.in);

        // input the number of rounds you want to play.
        int round = -1;
        while (round < 0) {
            System.out.println("Please set the number of round you want to play: ");
            round = Integer.parseInt(roundNum.next());
            if (round == 0) {
                System.out.println("Bye!");
                return;
            }
            else if (round < 0) {
                System.out.println("Invalid input!");
            }
        }

        String userChoose = null;
        String compChoose = null;

        int compWinCount = 0;
        int userWinCount = 0;

        for (int index = 1; index <= round; index++){
            System.out.println("Round " + index + ":");
            System.out.println("Please select one of \"rock, paper and scissors\" as your choose.");
            userChoose = input.next();
            userChoose = user.choose(userChoose);
            compChoose =cmp.choose();


            // if both computer and user choose same shape
            if (userChoose.equals(compChoose)) System.out.println("Tie!");
            //computer wins
            else if (userChoose.equals("scissors") && compChoose.equals("rock") ){
                compWinCount++;
                System.out.println("Computer wins!");
            }
            else if (userChoose.equals("rock") && compChoose.equals("paper")){
                compWinCount++;
                System.out.println("Computer wins!");
            }
            else if (userChoose.equals("paper") && compChoose.equals("scissors")){
                compWinCount++;
                System.out.println("Computer wins!");
            }
            // user wins
            else if (userChoose.equals("rock") && compChoose.equals("scissors")){
                userWinCount++;
                System.out.println("User wins!");
            }
            else if (userChoose.equals("paper") && compChoose.equals("rock")){
                userWinCount++;
                System.out.println("User wins!");
            }
            else if (userChoose.equals("scissors") && compChoose.equals("paper")){
                userWinCount++;
                System.out.println("User wins!");
            }

            // invalid input
            else {
                System.out.println("This is not a valid input! Please check your spelling!");
                System.out.println();
                continue;
            }

            System.out.println();
        }

        // show result
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("**************************Result*********************************");
        if (userWinCount > compWinCount){
            System.out.println("User wins! The score is " + "user: " + userWinCount + " VS " + "computer: " + compWinCount);
        }
        else if (userWinCount < compWinCount){
            System.out.println("Computer wins! The score is " + "user: "+userWinCount+" VS " + "computer: "+compWinCount);
        }
        else if (userWinCount == compWinCount){
            System.out.println("Tie! The score is " + "user: " + userWinCount + " VS " + "computer: "+compWinCount);
        }
        else {
            System.out.println("Error!");
        }
    }

}