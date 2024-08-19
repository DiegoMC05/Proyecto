/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author HP
 */
public class EnemigoTipoB extends Enemigo{
    public EnemigoTipoB(){
        super();
    }
    
   
    public void daniar(){
    System.out.println("el enemigo te quito vida");
    System.out.println("has perdido esta ronda");
    salud -= 35;
    fuerza -= 25;
    
    System.out.println("salud: "+ salud);
    System.out.println("fuerza: "+ fuerza);
    }
    
    public void perder(){
        System.out.println("has ganado esta ronda");
        this.salud += 15;
        
        System.out.println("salud"+ salud);
        System.out.println("fuerza"+ fuerza);
        
    }
}

