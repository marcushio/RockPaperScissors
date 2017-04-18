import java.util.Scanner; 
/**
 * A representation of someone playing rock paper scissors. They
 * track how many wins they have, and make moves (of rock, paper, or
 * scissors) 
 * 
 * @author (Marcus Trujillo) 
 * @version (0.0)
 */
public class Player {
    private int winCount; //how many times they've won
    private String userMove; //what the user types after prompted for a move
    private Move move; //the move based on what user typed
    
    private Scanner moveGetter;
    
    public Player(){
        moveGetter = new Scanner(System.in); 
        winCount = 0; 
    }
    
    /**
     * @returns user's move
     */
    private Move declareMove(){
        System.out.println(Prompts.MOVE); 
        userMove = moveGetter.nextLine(); 
        switch (userMove){
            case "rock" : move = Move.ROCK; 
            case "paper" : move = Move.PAPER; 
            case "scissors" : move = Move.SCISSORS; 
        }
        return move; 
    }
    
    public void addWin(){
        winCount++; 
    }
    
    public int getWinCount(){
        return winCount; 
    }
    
    public Move getMove(){
        return move; 
    }
}
