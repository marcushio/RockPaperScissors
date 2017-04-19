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
    private String stringMove; //what the user types after prompted for a move
    private Move move; //the move based on what user typed
    private String name; 
    private Scanner moveGetter;
    
    public Player(String name){
        moveGetter = new Scanner(System.in); 
        this.name = name; 
        winCount = 0; 
    }
    
    /**
     * @returns user's move
     */
    public Move declareMove(){
        
        stringMove = moveGetter.nextLine(); 
        switch (stringMove){
            case "rock" : move = Move.ROCK; 
                          break; 
            case "paper" : move = Move.PAPER; 
                           break; 
            case "scissors" : move = Move.SCISSORS; 
                              break; 
        }
        return move; 
    }
    
    public String toString(){
        return name; 
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
