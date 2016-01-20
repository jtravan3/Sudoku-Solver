package com.jtravan.sudoku;

import java.util.Arrays;

/**
 * Created by johnravan on 1/19/16.
 */
public class SudokuTester {

    public static void main(String[] args) {

        // Sudoku Puzzle to solve
        char[][] puzzleBoard = new char[][]{
                {'.', '.', '.', '.', '.', '9', '.', '3', '.'},
                {'.', '.', '1', '.', '.', '.', '.', '.', '9'},
                {'.', '3', '.', '8', '5', '.', '2', '.', '.'},
                {'.', '.', '.', '.', '6', '3', '5', '.', '.'},
                {'7', '1', '.', '.', '9', '.', '.', '8', '4'},
                {'.', '.', '3', '1', '7', '.', '.', '.', '.'},
                {'.', '.', '7', '.', '8', '4', '.', '6', '.'},
                {'2', '.', '.', '.', '.', '.', '8', '.', '.'},
                {'.', '5', '.', '9', '.', '.', '.', '.', '.'}
        };

        SudokuSolver solver = new SudokuSolver();

        if(solver.solveSudoku(puzzleBoard)) {
            System.out.println("Puzzle was solved!");
            String arrayAsString = Arrays.deepToString(puzzleBoard);
            String[] rows = arrayAsString.split("],");

            for(String str : rows) {
                System.out.println(str);
            }

        } else {
            System.err.println("There was an error!");
        }

    }

}
