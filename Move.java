
/**
 * Write a description of Moves here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum Move{
    
    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");
    
    private String move; 
    
    Move(String userMove){
        move = userMove; 
    }
    
    public String toString(){
        return move; 
    }
}
