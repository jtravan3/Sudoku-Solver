
package com.jtravan.sudoku;


public class SudokuSolver {

    private char[][] puzzle;


    public boolean solveSudoku(char[][] board) {

        if (board==null||board.length==0){
            return false;
        }

        puzzle = board;
        return solved(puzzle);

    }


    private boolean solved(char[][] board) {

        for(int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                if (board[i][j]=='.'){
                    for (char num='1'; num<='9'; num++){

                        if(isValid(board, i, j, num)){
                            // no conflict
                            board[i][j]=num;

                            if (solved(board)){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }

                        }

                    }
                    // if no proper number found, return false
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isValid(char[][] board, int i, int j, char c){

        // check column
        for (int row=0; row<9; row++){
            if (board[row][j]==c){
                return false;
            }


        }

        // check row
        for (int col=0; col<9; col++){
            if (board[i][col]==c){
                return false;
            }

        }

        // check block
        for(int row=i/3*3; row<i/3*3+3; row++){
            for (int col=j/3*3; col<j/3*3+3; col++){
                if (board[row][col]==c){
                    return false;
                }

            }
        }

        return true;

    }


    public char[][] getBoard() {
        return puzzle;
    }
    
}