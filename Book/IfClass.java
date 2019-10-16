public class IfClass {
    private Mark[] board;
    private int location;
    private int currentPlayer;
    public enum Mark{ //defining possible values for tiles
        X,O,N
    }
    private final Mark[] MARKS = {Mark.X, Mark.O};
    static private final Mark xPlayer = Mark.X;
    static private final Mark oPlayer = Mark.O;
    private boolean row1, row2, row3, col1, col2, col3, diagonal1, diagonal2;
    //constructor function
    public IfClass(){    
        board = new Mark[9];
        for(int i = 0; i < 9; i++){ //normalization for board
            board[i] = Mark.N;  
        } //end of for
    }//end constructor

    public static void main(String[] args){
        IfClass b = new IfClass();
        /*
        b.makeMove(0,xPlayer);  //1 x
        b.makeMove(1,oPlayer);  //2 o
        b.makeMove(2,oPlayer);  //3 o
        b.makeMove(3,oPlayer);  //4 x
        b.makeMove(4,xPlayer);  //5 o
        b.makeMove(5,xPlayer);  //6 x
        b.makeMove(6,Player);  //7 o
        b.makeMove(7,oPlayer);  //8 x
        b.makeMove(8,oPlayer);  //9 o
        */
        /*
        System.out.println(b.isWon(Mark.O)+ " o");
        System.out.println(b.isWon(Mark.X)+ " x");
        System.out.println(b.isTie() + " tie");
        */
        System.out.println(Mark.X);
        System.out.println(Mark.O);
    } //end main

    //set tile to some symbol
    public void makeMove(int location,Mark mark){
        if(!taken(location)){
            System.out.println("move is valid!");
            board[location] = mark; //quetion is how to set ths to cool changing currentPlayer int
        } else { //place taken
            System.out.println("move is invalid" +
            "try again");
        }
    }

    public boolean isTie(){
        int i = 0;
        if(!isWon(Mark.X) && !isWon(Mark.O)){ //main condition
            while(taken(i)){
                i++;
            }
            return (i >= 8) ? true: false; 
        
        } else { //else of main condition
            return false;
        }
    }

    public boolean taken(int location){
        try {
        return (board[location] == xPlayer || board[location] ==  oPlayer);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            return false;
        }
    }

    public boolean isWon(Mark mark){ //mark contains each player's own symbol
      
        row1 = board[0] == board[1] && board[1] == board[2] && board[2] == mark;
        row2 = board[3] == board[4] && board[4] == board[5] && board[5] == mark;
        row3 = board[6] == board[7] && board[7] == board[8] && board[8] == mark;
        
        col1 = board[0] == board[3] && board[3] == board[6] && board[6] == mark;
        col2 = board[1] == board[4] && board[4] == board[7] && board[7] == mark;
        col3 = board[2] == board[5] && board[5] == board[8] && board[8] == mark;
        
        diagonal1 = board[0] == board[4] && board[4] == board[8] && board[8] == mark;
        diagonal2 = board[2] == board[4] && board[4] == board[6] && board[6] == mark;
    
        if((row1)||(row2)||(row3)){
            return true;
        } else if((col1)||(col2)||(col3)){
            return true;
        } else if((diagonal1)||(diagonal2)){
            return true;
        }else {
            return false; //otherwise
        }
    }



    public boolean isGameOver(){
        if(!isWon(xPlayer) && !isWon(oPlayer) && isTie()){
            return true;
        } else {
            return false;
        }
    }
}//end class