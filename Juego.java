/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sebas
 */
public interface Juego {
    void iniciarJuego();
    void mostrarOpciones(int nivel); // Corregido para aceptar nivel
    void procesarDecisiones(int eleccion); // Corregido para aceptar solo la elección
    boolean verificarEstado();
}
