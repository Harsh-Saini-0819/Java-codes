import java.util.*;

class Game{
    public  int userInput;
    public  int compChoice;
    public Game(){
        System.out.println("-----Starting the game \"Guess the Number\"-----\n");
        System.out.println("You Have Only 7 chances......");
        System.out.println("Computer is chosing no. between 1 to 100");
        Random r = new  Random();
        this.compChoice = r.nextInt(100);

    }

    public void userinput(){
        System.out.print("Enter your number :");
        Scanner sc = new Scanner(System.in);
        this.userInput = sc.nextInt();
    }

    public boolean iscorrect(){
        if(this.userInput == this.compChoice){
            System.out.println("Great, You guessed the number !!\nThe no. is "+this.compChoice);
            return false;
        }
        else{
            return true;
        }
        
    }
    
    public void check(){
        if(this.userInput > this.compChoice){
            System.out.println("You entered a bigger number !!\n");
        }
        else{
            System.out.println("You entered a lesser number !!\n");
        }
    }
}
public class GameCode {

//Game
    public static void main(String[] args) {
        int i = 1;
        Game g = new Game();
        do { 
            if(i == 8){
                System.out.println("You lost the game !!");
                break;
            }
            g.userinput();
            g.check();
            i++;
        } while (g.iscorrect());

        
    }
}