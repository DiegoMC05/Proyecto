/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Random;

public class Buscaminas {
    public static final int SIZE = 5; // B
    public static final int MINES = 5; // Numero de minas
    private char[][] board = new char[SIZE][SIZE];
    private boolean[][] mines = new boolean[SIZE][SIZE];
    private boolean[][] revelar = new boolean[SIZE][SIZE];

    public Buscaminas() {
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '-';
                revelar[i][j] = false;
            }
        }
    }

    private void placeMines() {
        Random rand = new Random();
        int minesPlaced = 0;
        while (minesPlaced < MINES) {
            int fila = rand.nextInt(SIZE);
            int columna = rand.nextInt(SIZE);
            if (!mines[fila][columna]) {
                mines[fila][columna] = true;
                minesPlaced++;
            }
        }
    }

    public boolean play(int fila, int columna) {
        if (mines[fila][columna]) {
            System.out.println("You hit a mine! Game Over.");
            return true;
        } else {
            revealCell(fila, columna);
            if (checkVictory()) {
                printBoard();
                System.out.println("Congratulations! You won.");
                return true;
            }
        }
        return false;
    }

    private void revealCell(int fila, int columna) {
        if (revelar[fila][columna]) {
            return;
        }
        revelar[fila][columna] = true;
        int adjacentMines = countAdjacentMines(fila, columna);
        board[fila][columna] = (char) (adjacentMines + '0');

        if (adjacentMines == 0) {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    int newRow = fila + i;
                    int newCol = columna + j;
                    if (isValid(newRow, newCol)) {
                        revealCell(newRow, newCol);
                    }
                }
            }
        }
    }

    private int countAdjacentMines(int fila, int columna) {
        int count = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = fila + i;
                int newCol = columna + j;
                if (isValid(newRow, newCol) && mines[newRow][newCol]) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isValid(int fila, int columna) {
        return fila >= 0 && fila < SIZE && columna >= 0 && columna < SIZE;
    }

    private boolean checkVictory() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (!mines[i][j] && !revelar[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void printBoard() {
        System.out.println("Board:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (revelar[i][j]) {
                    System.out.print(board[i][j] + " ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
