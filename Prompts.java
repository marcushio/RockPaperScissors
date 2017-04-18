
/**
 * Write a description of Prompts here.
 * 
 * @author (Marcus) 
 * @version (a version number or a date)
 */
public enum Prompts {
    MOVE("What's your move \n rock, paper, or scissors?"), 
    WELCOME("This is straightforward game of Rock,Paper,Scissors"), 
    CHOICE("You chose "), 
    WINSNEEDED("Enter [1] for a single game, or [5] for best of five"); 
    private String phrase;
    
    Prompts(String phrase){
        this.phrase = phrase;
    }
    
    public String toString(){
        return phrase; 
    }

}
