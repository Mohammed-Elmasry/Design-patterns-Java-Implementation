public class Enhanced {
    //private Mark[] board;
    private String[] board;
    private int location;
    private int currentPlayer;

    //private final Mark[] MARKS = {Mark.X, Mark.O};
    private final static String[] MARKS = {"X","O"}; //domain of choice

    static private final int PLAYER_X = 0;
    static private final int PLAYER_O = 1;
    
    //potential outcomes (probability of win)
    private boolean row1, row2, row3, col1, col2, col3, diagonal1, diagonal2;
    
    
    //constructor function
    public Enhanced(){    
        board = new String[9];
        for(int i = 0; i < 9; i++){ //normalization for board
            board[i] = "";  
        } //end of for
    }//end constructor


    public static void main(String[] args){
        Enhanced b = new Enhanced();
        
        //testing board datatype
        for(int i = 0; i < b.board.length; i++){
            System.out.println(b.board[i] instanceof String);
        }

        /* 
        b.makeMove(0,PLAYER_X);  //1 x
        b.makeMove(1,PLAYER_O);  //2 o
        b.makeMove(2,PLAYER_O);  //3 o
        b.makeMove(3,PLAYER_O);  //4 x
        b.makeMove(4,PLAYER_X);  //5 o
        b.makeMove(5,PLAYER_X);  //6 x
        b.makeMove(6,PLAYER_O);  //7 o
        b.makeMove(7,PLAYER_O);  //8 x
        b.makeMove(8,PLAYER_O);  //9 o
       
        System.out.print(b.board[0]);
        System.out.print(b.board[1]);
        System.out.println(b.board[2]);
        System.out.print(b.board[3]);
        System.out.print(b.board[4]);
        System.out.println(b.board[5]);
        System.out.print(b.board[6]);
        System.out.print(b.board[7]);
        System.out.println(b.board[8]);
        
        /* 
        System.out.println("X player won value is" + " " + b.isWon(0));
        System.out.println("O player won value is" + " " + b.isWon(1));
 */

        //System.out.println("game result is a Tie " + b.isTie()); // expected True..
        
        //testing isGameOver()
                b.makeMove(0,PLAYER_X);  //1 x
                b.makeMove(1,PLAYER_O);  //2 o
                b.makeMove(2,PLAYER_O);  //3 o
                b.makeMove(3,PLAYER_O);  //4 x
                b.makeMove(4,PLAYER_X);  //5 o
                b.makeMove(5,PLAYER_X);  //6 x
                b.makeMove(6,PLAYER_O);  //7 o
                b.makeMove(7,PLAYER_O);  //8 x
                b.makeMove(8,PLAYER_O);  //9 o
                System.out.println(b.isTie());
                System.out.println(b.isGameOver());

            //display board        
        System.out.print(b.board[0]);
        System.out.print(b.board[1]);
        System.out.println(b.board[2]);
        System.out.print(b.board[3]);
        System.out.print(b.board[4]);
        System.out.println(b.board[5]);
        System.out.print(b.board[6]);
        System.out.print(b.board[7]);
        System.out.println(b.board[8]);
        
    
    } //end main



    
    //set tile to some symbol
    public void makeMove(int location,int currentPlayer){
        if(!isOccupied(location)){
            System.out.println("move is valid!");
            board[location] = MARKS[currentPlayer]; //quetion is how to set ths to cool changing currentPlayer int
        } else { //place taken
            System.out.println("move is invalid" +
            "try again");
        }
    }

    
    /* public boolean isOccupied(int location){
        
        return (board[location] == MARKS[PLAYER_X] || board[location] ==  MARKS[PLAYER_O]);
    } */

    //integrate into code
    public boolean isWon(int player){ //mark contains each player's own symbol
     //boolean variables build.. 
    row1 = board[0] == board[1] && board[1] == board[2] && board[2] == MARKS[player];
    row2 = board[3] == board[4] && board[4] == board[5] && board[5] == MARKS[player];
    row3 = board[6] == board[7] && board[7] == board[8] && board[8] == MARKS[player];
    
    col1 = board[0] == board[3] && board[3] == board[6] && board[6] == MARKS[player];
    col2 = board[1] == board[4] && board[4] == board[7] && board[7] == MARKS[player];
    col3 = board[2] == board[5] && board[5] == board[8] && board[8] == MARKS[player];
    
    diagonal1 = board[0] == board[4] && board[4] == board[8] && board[8] == MARKS[player];
    diagonal2 = board[2] == board[4] && board[4] == board[6] && board[6] == MARKS[player];

    if((row1)||(row2)||(row3)){
        return true;
    } else if((col1)||(col2)||(col3)){
        return true;
    } else if((diagonal1)||(diagonal2)){
        return true;
    }else {
        return false; //otherwise
    } //end if decision tree
} //end method isWon()


    //checks if nobody won...
    public boolean isTie(){
        int counter = 0;
        if(!isWon(0) && !isWon(1)){ //main condition
            while(isOccupied(counter) && counter < 8){
                counter++;
            } //end while
            return (counter == 8) ? true: false; //if true then all tiles are occupied, else --> still moves to be made
        } else { //else of main condition
            return false;
        } //end else block
    } //end method isTie() 

    
    public boolean isGameOver(){
        if(isWon(PLAYER_X) || isWon(PLAYER_O) || isTie()){
            return true;
        } else {
            return false;
        }
    } //end method isGameOver()

    //testing original isOccupied
    //check if tile is occupied
    public boolean isOccupied(int location){
        return (board[location].equals(MARKS[PLAYER_X]) || board[location].equals(MARKS[PLAYER_O]));
    }//end method isOccupied()

} // end of class