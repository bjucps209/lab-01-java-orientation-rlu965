package  app;

import java.lang.reflect.Array;

import org.checkerframework.common.returnsreceiver.qual.This;



public class TicTacToeGame {
    private char[][] grid = new char[3][3];

    private char currentPlayer = 'X';
    private char winner = ' ';

    
    
    public void setGrid(char[][] grid) {
        this.grid = grid;
    }
    
    public char[][] getGrid() {
        return this.grid;
    }
    
    public void setCurrentPlayer(char currentPlayers) {
        this.currentPlayer = currentPlayers;
    }

    public char getCurrentPlayer() {
        return this.currentPlayer;
    }

    public void setWinner(char winner){
        this.winner = winner;
    }
    
    public char getWinner() {
        return this.winner;
    }

    public void processMove(int row, int col) {
       
              
        
        if (getWinner()!= ' ')
            return;

        if (getGrid()[row][col] != ' ')
            return;

            getGrid()[row][col] = getCurrentPlayer(); 
            boolean rowWin = getGrid()[row][0] == getCurrentPlayer() &&
            getGrid()[row][1] == getCurrentPlayer() &&
            getGrid()[row][2] == getCurrentPlayer();

// 通过 getter 检查列是否获胜
boolean colWin = getGrid()[0][col] == getCurrentPlayer() &&
            getGrid()[1][col] == getCurrentPlayer() &&
            getGrid()[2][col] == getCurrentPlayer();
if (rowWin || colWin) {
   setWinner(getCurrentPlayer());
   return;
}
setCurrentPlayer((getCurrentPlayer() == 'X') ? 'O' : 'X');
        
       
        // 检查当前行是否相同



        
}
}
