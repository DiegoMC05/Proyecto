/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sebas
 */
import java.util.Scanner;

public class Gato {
    private static final char VACIO = ' ';
    private static final char JUGADOR_X = 'X';
    private static final char JUGADOR_O = 'O';
    private char[][] tablero = new char[3][3];
    private char jugadorActual = JUGADOR_X;
    private Nodo cabeza;

    // Nodo para almacenar el resultado de cada juego
    private class Nodo {
        String resultado;
        Nodo siguiente;

        Nodo(String resultado) {
            this.resultado = resultado;
            this.siguiente = null;
        }
    }

    public Gato() {
        reiniciarTablero();
        cabeza = null; // Inicializa la lista de registro de juegos
    }

    // Método para reiniciar el tablero y el jugador actual
    private void reiniciarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = VACIO;
            }
        }
        jugadorActual = JUGADOR_X;
    }

    public void jugar() {
        reiniciarTablero(); // Reinicia el tablero antes de empezar un nuevo juego
        Scanner scanner = new Scanner(System.in);

        while (true) {
            imprimirTablero();
            System.out.println("Jugador " + jugadorActual + ", ingrese fila y columna (0-2): ");
            int fila = scanner.nextInt();
            int columna = scanner.nextInt();

            if (hacerMovimiento(fila, columna)) {
                if (verificarVictoria()) {
                    imprimirTablero();
                    System.out.println("¡Jugador " + jugadorActual + " gana!");
                    registrarJuego("Jugador " + jugadorActual + " gana.");
                    break;
                }
                if (verificarTableroLleno()) {
                    imprimirTablero();
                    System.out.println("¡Es un empate!");
                    registrarJuego("Empate.");
                    break;
                }
                cambiarJugador();
            } else {
                System.out.println("Movimiento inválido, intente de nuevo.");
            }
        }
    }

    private void imprimirTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            System.out.println();
            if (i < 2) System.out.println("---------");
        }
    }

    private boolean hacerMovimiento(int fila, int columna) {
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == VACIO) {
            tablero[fila][columna] = jugadorActual;
            return true;
        }
        return false;
    }

    private boolean verificarVictoria() {
        // Verificar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                return true;
            }
            if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                return true;
            }
        }
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }
        return false;
    }

    private boolean verificarTableroLleno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == VACIO) {
                    return false;
                }
            }
        }
        return true;
    }

    private void cambiarJugador() {
        jugadorActual = (jugadorActual == JUGADOR_X) ? JUGADOR_O : JUGADOR_X;
    }

    private void registrarJuego(String resultado) {
        Nodo nuevoNodo = new Nodo(resultado);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public void imprimirRegistroJuegos() {
        Nodo actual = cabeza;
        System.out.println("Registro de Juegos:");
        while (actual != null) {
            System.out.println(actual.resultado);
            actual = actual.siguiente;
        }
    }
}
