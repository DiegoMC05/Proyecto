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
import java.util.ArrayList;

public class Anagramas {
    private ArrayList<String[]> records;

    public Anagramas() {
        this.records = new ArrayList<>();
    }

    public boolean jugar(String palabraOriginal, String palabraDesordenada, Scanner sc) {
        System.out.println("Palabra desordenada: " + palabraDesordenada);
        System.out.print("Adivina la palabra: ");
        String respuesta = sc.nextLine().toUpperCase(); // Convertir a mayúsculas para evitar errores por minúsculas

        if (respuesta.equals(palabraOriginal)) {
            System.out.println("¡Correcto!");
            return true; // Continúa el juego
        } else {
            System.out.println("Incorrecto. La palabra correcta era: " + palabraOriginal);
            return false; // Termina el juego
        }
    }

    public void agregarRecord(int puntaje) {
        String[] nuevoRecord = {String.valueOf(puntaje), obtenerFecha()};
        records.add(nuevoRecord);
        ordenarRecords(); // Ordenar los records después de añadir uno nuevo
    }

    public void mostrarRecords() {
        if (records.isEmpty()) {
            System.out.println("No hay records para mostrar.");
        } else {
            for (String[] record : records) {
                System.out.println("Puntaje: " + record[0] + " - Fecha: " + record[1]);
            }
        }
    }

    private String obtenerFecha() {
        return java.time.LocalDate.now().toString();
    }

    private void ordenarRecords() {
        for (int i = 0; i < records.size() - 1; i++) {
            for (int j = 0; j < records.size() - i - 1; j++) {
                if (Integer.parseInt(records.get(j)[0]) > Integer.parseInt(records.get(j + 1)[0])) {
                    String[] temp = records.get(j);
                    records.set(j, records.get(j + 1));
                    records.set(j + 1, temp);
                }
            }
        }
    }
}
