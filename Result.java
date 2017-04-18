
/**
 * Write a description of Result here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public enum Result {
    P1WIN("Player 1 Wins"), P2WIN("Player 2 Wins!"), DRAW("Draw!");
    
    private String result; 
    
    Result(String result){
        this.result = result; 
    }
    
    public String toString(){
        return result; 
    }
    
}
