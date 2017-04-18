import java.util.Scanner; 
/**
 * Write a description of Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game {
    private Player player1; 
    private Player player2; 
    private Result result; 
    private Player currentPlayer; 
    private Player winner; 
    private int winsNeeded; 
    private boolean running; 
    
    private Scanner inputGet; 
    
    public Game(){
        player1 = new Player(); 
        player2 = new Player(); 
        currentPlayer = player1; 
        inputGet = new Scanner(System.in); 
        running = true; 
        winner = null; 
    }
    
    public void run(){
       printWelcome(); 
       setWinsNeeded(); 
       do{
        currentPlayer.getMove(); 
        System.out.print(Prompts.CHOICE); 
        System.out.println(currentPlayer.getMove()); 
        checkWinner(player1.getMove(), player2.getMove()); 
        checkSeries(); 
        printResult();
        if (running){
            changePlayer();
        }     
       } while(running);
    }
    
    private void setWinsNeeded(){
        System.out.println(Prompts.WINSNEEDED); 
        winsNeeded = Integer.parseInt(inputGet.nextLine());
    }
    
    private Player getCurrentPlayer(){
        return currentPlayer; 
    }
    
    private void changePlayer(){
        if (currentPlayer == player1){
            currentPlayer = player2;
        }
        if (currentPlayer == player2){
            currentPlayer = player1; 
        }
    }
    
    private void printWelcome(){
        System.out.println(Prompts.WELCOME); 
    }
    
    /*
    private String getPlayerMove(){
        System.out.println();
        return currentPlayer.moveGetter.getMove(); 
    }
    */ 
    
    private Result checkWinner(Move p1Move, Move p2Move){
        if (p1Move == Move.ROCK){
            switch (p2Move){
                case ROCK : result = Result.DRAW; 
                case PAPER : result = Result.P2WIN; 
                             player2.addWin(); 
                case SCISSORS : result = Result.P1WIN; 
                                player1.addWin(); 
            }
        }
        if (p1Move == Move.PAPER){
            switch (p2Move){
                case ROCK: result = Result.P1WIN; 
                                    player1.addWin(); 
                case PAPER: result = Result.DRAW;   
                case SCISSORS: result = Result.P2WIN;
                                        player2.addWin(); 
            }
        }
        if (p1Move == Move.SCISSORS){
            switch (p2Move) {
                case ROCK: result = Result.P2WIN;  
                                    player2.addWin(); 
                case PAPER: result = Result.P1WIN; 
                                     player1.addWin(); 
                case SCISSORS: result = Result.DRAW;  
            }
        }
        if (p1Move == null || p2Move == null){
            result = null ; 
        }
        return result; 
    }
    
    private Player checkSeries(){
        if (currentPlayer.getWinCount() >= winsNeeded){
            running = false; 
            currentPlayer = winner; 
        }
        return winner; 
    }
        
    private void printResult(){
        System.out.println(result); 
    }
}
    
    

