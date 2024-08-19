/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Scanner;

class Preguntas {
    // Preguntas para el nivel 1
    public static boolean pregunta1(Scanner sc) {
        System.out.println("¿Cual es la capital de Francia?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("paris");
    }

    public static boolean pregunta2(Scanner sc) {
        System.out.println("¿Cual es el rio mas largo del mundo?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("amazonas");
    }

    public static boolean pregunta3(Scanner sc) {
        System.out.println("¿En que año llego el hombre a la Luna?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("1969");
    }

    public static boolean pregunta4(Scanner sc) {
        System.out.println("¿Cual es el pais mas grande del mundo?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("rusia");
    }

    public static boolean pregunta5(Scanner sc) {
        System.out.println("¿Cual es el oceano mas grande del mundo?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("pacifico");
    }

    public static boolean pregunta6(Scanner sc) {
        System.out.println("¿Cual es el planeta mas cercano al Sol?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("mercurio");
    }

    public static boolean pregunta7(Scanner sc) {
        System.out.println("Completa el refran: ojos que no ven...");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("corazon que no siente");
    }

    public static boolean pregunta8(Scanner sc) {
        System.out.println("¿Que gas usan las plantas para la fotosintesis?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("dioxido de carbono") || respuesta.equalsIgnoreCase("CO2");
    }

    public static boolean pregunta9(Scanner sc) {
        System.out.println("Rama de las matematicas que dedica al estudio de las formas, las medidas, las posiciones, etc.");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("geometria");
    }

    public static boolean pregunta10(Scanner sc) {
        System.out.println("Segun la religion, es el primer humano de la historia");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("adan");
    }

    // Preguntas para el nivel 2
    public static boolean pregunta11(Scanner sc) {
        System.out.println("¿Cual es la capital de Colombia?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("bogota");
    }

    public static boolean pregunta12(Scanner sc) {
        System.out.println("¿Cual es simbolo quimico de la plata?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("Ag") || respuesta.equalsIgnoreCase("ag");
    }

    public static boolean pregunta13(Scanner sc) {
        System.out.println("Primer presidente de México electo en siglo 21:");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("vicente fox");
    }

    public static boolean pregunta14(Scanner sc) {
        System.out.println("Ciencia que estudia a los animales desde diferentes perspectivas");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("zoologia");
    }

    public static boolean pregunta15(Scanner sc) {
        System.out.println("Pais famoso por los chocolates, los relojes y sus Alpes");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("suiza");
    }

    public static boolean pregunta16(Scanner sc) {
        System.out.println("¿Como se dice uva en ingles?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("grape");
    }

    public static boolean pregunta17(Scanner sc) {
        System.out.println("¿Cual es el animal terrestre mas rapido?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("guepardo") || respuesta.equalsIgnoreCase("leopardo");
    }

    public static boolean pregunta18(Scanner sc) {
        System.out.println("Menciona un color de la bandera de Uruguay");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("blanco") || respuesta.equalsIgnoreCase("azul") || respuesta.equalsIgnoreCase("amarillo");
    }

    public static boolean pregunta19(Scanner sc) {
        System.out.println("¿Cual es el metal mas abundante en la corteza terrestre?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("aluminio");
    }

    public static boolean pregunta20(Scanner sc) {
        System.out.println("¿Cual es el oceano mas pequeño del mundo?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("artico");
    }

    // Preguntas para el nivel 3
    public static boolean pregunta21(Scanner sc) {
        System.out.println("¿Cual es la capital de Hungria?");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("budapest");
    }

    public static boolean pregunta22(Scanner sc) {
        System.out.println("Menciona una potencia del eje en la Segunda Guerra Mundial");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("alemania") || respuesta.equalsIgnoreCase("italia") || respuesta.equalsIgnoreCase("japon");
    }

    public static boolean pregunta23(Scanner sc) {
        System.out.println( "Pelicula que gano el Oscar en 1997:");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("titanic");
    }

    public static boolean pregunta24(Scanner sc) {
        System.out.println("Año en que se celebraron los primeros Juegos Olimpicos");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("1896");
    }

    public static boolean pregunta25(Scanner sc) {
        System.out.println("Letra que denota a los numeros racionales");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("q");
    }

    public static boolean pregunta26(Scanner sc) {
        System.out.println("Animal cuyo nombre tiene las cinco vocales");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("murcielago");
    }

    public static boolean pregunta27(Scanner sc) {
        System.out.println("No muerde ni ladra, pero tiene dientes y la casa guarda.");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("llaves");
    }

    public static boolean pregunta28(Scanner sc) {
        System.out.println("Capital de Puebla");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("puebla");
    }

    public static boolean pregunta29(Scanner sc) {
        System.out.println(" Nombre del protagonista del Señor de los Anillos");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("frodo");
    }

    public static boolean pregunta30(Scanner sc) {
        System.out.println("Empresa estadounidense que tiene el nombre de una fruta");
        String respuesta = sc.nextLine();
        return respuesta.equalsIgnoreCase("apple");
    }

    // Método general para seleccionar la pregunta correcta
    public static boolean pregunta(Scanner sc, int numeroPregunta) {
        switch (numeroPregunta) {
            case 1: return pregunta1(sc);
            case 2: return pregunta2(sc);
            case 3: return pregunta3(sc);
            case 4: return pregunta4(sc);
            case 5: return pregunta5(sc);
            case 6: return pregunta6(sc);
            case 7: return pregunta7(sc);
            case 8: return pregunta8(sc);
            case 9: return pregunta9(sc);
            case 10: return pregunta10(sc);
            case 11: return pregunta11(sc);
            case 12: return pregunta12(sc);
            case 13: return pregunta13(sc);
            case 14: return pregunta14(sc);
            case 15: return pregunta15(sc);
            case 16: return pregunta16(sc);
            case 17: return pregunta17(sc);
            case 18: return pregunta18(sc);
            case 19: return pregunta19(sc);
            case 20: return pregunta20(sc);
            case 21: return pregunta21(sc);
            case 22: return pregunta22(sc);
            case 23: return pregunta23(sc);
            case 24: return pregunta24(sc);
            case 25: return pregunta25(sc);
            case 26: return pregunta26(sc);
            case 27: return pregunta27(sc);
            case 28: return pregunta28(sc);
            case 29: return pregunta29(sc);
            case 30: return pregunta30(sc);
            default: return false;
        }
    }
}

