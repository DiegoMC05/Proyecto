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

public class JuegoDestinoFinal implements Juego {

    private boolean juegoActivo;
    private int nivel;
    private Enemigo enemigo;

    public JuegoDestinoFinal(Personaje personaje, Enemigo enemigo) {
        this.enemigo = enemigo;
        // Inicializar el juego al crear la instancia
        this.juegoActivo = true;
        this.nivel = 1;
    }

    @Override
    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);

        while (juegoActivo) {
            mostrarOpciones(nivel);
            int eleccion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            procesarDecisiones(eleccion); // Llamar con solo la elección

            if (!verificarEstado()) {
                System.out.println("El juego se reiniciará.");
                reiniciarJuego();
                return;  // Salir del método para evitar avanzar niveles
            }

            nivel++;  // Incrementar el nivel si la elección fue correcta

            if (nivel > 3) {
                System.out.println("¡Has completado el juego!");
                break;
            }
        }
    }

    public void reiniciarJuego() {
        this.juegoActivo = true;
        this.nivel = 1;  // Reiniciar el nivel al 1
    }

   
    public void mostrarOpciones(int nivel) {
        if (nivel == 1) {
            System.out.println("Has salido de la fiesta y vas para tu casa pero te perdiste, elige un camino:");
            System.out.println("1. Ir por el puente");
            System.out.println("2. Pedir ayuda a un extraño que está en la carretera");
        } else if (nivel == 2) {
            System.out.println("Has salido de la fiesta y vas para tu casa pero te perdiste, elige un camino:");
            System.out.println("1. Continuas caminando hasta llegar a una gasolinería");
            System.out.println("2. Pides ray a un camionero");
        } else if (nivel == 3) {
            System.out.println("1. Le pides ayuda a un policía que encontraste");
            System.out.println("2. Continúas caminando sin rumbo");
        }
        System.out.print("Selecciona una opción: ");
    }

    @Override
    public void procesarDecisiones(int eleccion) {
        if ((nivel == 1 && eleccion == 2) || (nivel == 2 && eleccion == 2) || (nivel == 3 && eleccion == 2)) {
            enemigo.daniofatal();
            juegoActivo = false;
        } else {
            System.out.println("Has elegido correctamente.");
        }
    }

    @Override
    public boolean verificarEstado() {
        return juegoActivo;
    }
}
