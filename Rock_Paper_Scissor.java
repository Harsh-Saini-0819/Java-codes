import java.util.*;
public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        String str[] = {"Rock", "Paper", "Scissor"};
        System.out.println("1.Rock  2.Paper  3.Scissor  4.Exit");
        System.out.printf("Enter your choice :");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        if(choice > 4 || choice <= 0){
            System.out.println("Invlaid Choice !!");
            return;
        }
        while(choice != 4){
            Random r = new Random();
            int x = r.nextInt(str.length)+1;
            System.out.println("Computer choice : "+ str[x-1]);
            if(x == choice){
                System.out.println("DRAW !!");
            }
            else if(x == 1 && choice == 2 || x == 2 && choice == 3 || x == 3 && choice == 1){
                System.out.println("You WON !!");
            }
            else{
                System.out.println("You LOST !!");
            }
            s = new Scanner(System.in);
            choice = s.nextInt();
        }
        System.out.println("Exiting.....");
        System.out.println("Thanks for playing the game !!");
    }
} 
