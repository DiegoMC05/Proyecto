/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sebas
 */
import java.util.Random;
import java.util.Scanner;

public class Tenis {
    private static final int JUEGOS_NECESARIOS = 6; // Número de juegos necesarios para ganar un set
    private static final int SETS_NECESARIOS = 3;   // Número de sets necesarios para ganar el partido

    private int puntosJugador1;
    private int puntosJugador2;
    private int juegosJugador1;
    private int juegosJugador2;
    private int setsJugador1;
    private int setsJugador2;
    private ColaTenis turnos;
    private Scanner scanner;
    private Tenista jugador1;
    private Tenista jugador2;
    private Random random;

    public Tenis() {
        puntosJugador1 = 0;
        puntosJugador2 = 0;
        juegosJugador1 = 0;
        juegosJugador2 = 0;
        setsJugador1 = 0;
        setsJugador2 = 0;
        scanner = new Scanner(System.in);
        random = new Random();

        // Inicializar jugadores
        jugador1 = new Tenista("Jugador 1", 0, 0);
        jugador2 = new Tenista("Jugador 2", 0, 0);
        

        // Inicializar turnos
        turnos = new ColaTenis();
        turnos.enqueue(1); // Jugador 1 empieza
        turnos.enqueue(2); // Jugador 2
    }

    public void mostrarPuntuacion() {
        System.out.println("Tablero de puntuacion:");
        System.out.println(jugador1.getNombre() + " - Puntos: " + puntosJugador1 + " | Juegos: " + juegosJugador1 + " | Sets: " + setsJugador1);
        System.out.println(jugador2.getNombre() + " - Puntos: " + puntosJugador2 + " | Juegos: " + juegosJugador2 + " | Sets: " + setsJugador2);
    }

    private boolean verificarEleccion(int eleccion, int respuestaCorrecta) {
        return eleccion == respuestaCorrecta;
    }

    private void jugarPunto() {
        int respuestaCorrecta = random.nextInt(2) + 1; // Número correcto aleatorio entre 1 y 2

        while (true) {
            int jugadorActual = turnos.peek();
            System.out.println("Jugador " + jugadorActual + ", elige 1 o 2: ");
            int eleccion = scanner.nextInt();

            if (verificarEleccion(eleccion, respuestaCorrecta)) {
                System.out.println("Eleccion correcta. Es el turno del siguiente jugador.");
                turnos.enqueue(turnos.dequeue()); // Pasar el turno
                respuestaCorrecta = random.nextInt(2) + 1; // Nuevo número aleatorio para el siguiente turno
            } else {
                int jugadorQueGano = (jugadorActual == 1) ? 2 : 1;
                System.out.println("Eleccion incorrecta. Jugador " + jugadorQueGano + " gana el punto.");
                if (jugadorQueGano == 1) {
                    puntosJugador1++;
                } else {
                    puntosJugador2++;
                }
                break;
            }
        }
    }

    private void verificarGanadorPunto() {
        if (puntosJugador1 >= 4 && puntosJugador1 - puntosJugador2 >= 2) {
            System.out.println("¡" + jugador1.getNombre() + " gana el juego!");
            juegosJugador1++;
            puntosJugador1 = 0;
            puntosJugador2 = 0;
            verificarGanadorJuego();
        } else if (puntosJugador2 >= 4 && puntosJugador2 - puntosJugador1 >= 2) {
            System.out.println("¡" + jugador2.getNombre() + " gana el juego!");
            juegosJugador2++;
            puntosJugador1 = 0;
            puntosJugador2 = 0;
            verificarGanadorJuego();
        }
    }

    private void verificarGanadorJuego() {
        if (juegosJugador1 >= JUEGOS_NECESARIOS) {
            System.out.println("¡" + jugador1.getNombre() + " gana el set!");
            setsJugador1++;
            juegosJugador1 = 0;
            juegosJugador2 = 0;
            verificarGanadorSet();
        } else if (juegosJugador2 >= JUEGOS_NECESARIOS) {
            System.out.println("¡" + jugador2.getNombre() + " gana el set!");
            setsJugador2++;
            juegosJugador1 = 0;
            juegosJugador2 = 0;
            verificarGanadorSet();
        }
    }

    private void verificarGanadorSet() {
        if (setsJugador1 >= SETS_NECESARIOS) {
            System.out.println("¡" + jugador1.getNombre() + " gana el partido!");
            reiniciarPartido();
        } else if (setsJugador2 >= SETS_NECESARIOS) {
            System.out.println("¡" + jugador2.getNombre() + " gana el partido!");
            reiniciarPartido();
        }
    }

    private void reiniciarPartido() {
        puntosJugador1 = 0;
        puntosJugador2 = 0;
        juegosJugador1 = 0;
        juegosJugador2 = 0;
        setsJugador1 = 0;
        setsJugador2 = 0;
        System.out.println("El partido se ha reiniciado.");
    }

    public void jugar() {
        System.out.println("¡Bienvenido al juego de tenis con sets y partidos!");
        System.out.println("Elige entre 1 o 2. El numero correcto es aleatorio.");
        System.out.println("El primer jugador en cometer un error perdera el punto.");

        while (true) {
            mostrarPuntuacion();
            jugarPunto();
            verificarGanadorPunto();
           
        }
    }
}
