/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author HP
 */
public class Enemigo {
    protected int salud, fuerza;
    
    public Enemigo() {
        salud = 75;
        fuerza = 100;
    }
    
    public void setSalud(int s) {
        salud = s;
    }
    
    public void setFuerza(int f) {
        fuerza = f;
    }
    
    public int getSalud() {
        return salud;
    }
    
    public int getFuerza() {
        return fuerza;
    }
    
    public void perder() {
        System.out.println("Has ganado esta ronda");
        this.salud += 5;  // Ajusta la salud según el parámetro
        System.out.println("Salud: " + this.salud);
        System.out.println("Fuerza: " + this.fuerza);
    }
    
  
    public void daniar() {
        System.out.println("El enemigo te quito vida");
        salud -= 20;  // Ajusta la salud y la fuerza según los parámetros
        fuerza -= 20;
        System.out.println("Salud: " + this.salud);
        System.out.println("Fuerza: " + this.fuerza);
    }
    public void daniofatal() {
        System.out.println("Has muerto");
        salud -= 100;  // Ajusta la salud y la fuerza según los parámetros
        fuerza -= 100;
        System.out.println("Salud: " + this.salud);
        System.out.println("Fuerza: " + this.fuerza);
    }
    
    public void amenazar() {
        System.out.println("Amenaza al heroe");
    }
}