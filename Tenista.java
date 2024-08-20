/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author sebas
 */
public class Tenista {
    private String nombre;
    private int juegosGanados;
    private int setsGanados;

    public Tenista(String nombre, int juegosGanados, int setsGanados) {
        this.nombre = nombre;
        this.juegosGanados = juegosGanados;
        this.setsGanados = setsGanados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }

    public int getSetsGanados() {
        return setsGanados;
    }

    public void setSetsGanados(int setsGanados) {
        this.setsGanados = setsGanados;
    }
}
