package exercise1a;

import java.util.Scanner;

public class NumberGuessingGameWithAMenu {
    private static  int getIntInRange(Scanner sc, int min, int max){
        while(true){
            try{
                String input = sc.nextLine();
                int num = Integer.parseInt(input);
                if(num >= min && num <= max) {
                    return num;
                }else {
                    System.out.println("The input must be between "+min+" and "+max+", please try again: ");
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid input, please enter an integer: ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("------Menu------");
            System.out.println("1.Start Game");
            System.out.println("2.Exit");
            System.out.print("Your Choice: ");

            int choice = getIntInRange(sc, 1, 2);

            switch (choice){
                case 1:
                    System.out.println("***************");
                    System.out.println("Start New Game");
                    System.out.println("***************");
                    int randomNum = (int)(Math.random() * 10) + 1;
                    boolean flag = false;
                    System.out.print("Please enter a number you guess ^v^ : ");
                    for(int i = 0; i < 5; i++){
                        int myNum= getIntInRange(sc, 1, 10);
                        if(randomNum == myNum){
                            System.out.println("Correct！");
                            //If the player guess correctly， he/she can start the new game
                            flag = true;
                            break;
                        }else if(randomNum > myNum){
                            System.out.println("Too Low!");
                        }else{
                            System.out.println("Too High!");
                        }

                        if(i < 4){
                            System.out.print("Please guess again(1~10): ");
                        }
                    }

                    if(!flag){
                        System.out.println("***************************************************");
                        System.out.println("You didn't guess it. The correct answer is: " + randomNum);
                        System.out.println("***************************************************");
                    }
                    break;
                case 2:
                    System.out.println("************************");
                    System.out.println("Thanks for playing, bye!");
                    System.out.println("************************");
                    return;
            }
        }
    }
}
