/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partido;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juliany
 */
public class LigaBaloncesto {
    public static void main(String[] args) {
        ArrayList<Partido> partidos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Registrar Partido de Liga");
            System.out.println("2. Registrar Partido de PlayOff");
            System.out.println("3. Finalizar Partido");
            System.out.println("4. Mostrar Info Partido");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                System.out.println("Equipo Local: ");
                String local = scanner.nextLine();
                System.out.println("Equipo Visitante: ");
                String visitante = scanner.nextLine();
                System.out.println("Fecha: ");
                String fecha = scanner.nextLine();
                System.out.println("Jornada: ");
                int jornada = scanner.nextInt();
                PartidoLiga partido = new PartidoLiga(local, visitante, fecha, jornada);
                partidos.add(partido);
                System.out.println("Partido registrado!");
            }

            if (opcion == 2) {
                System.out.println("Equipo Local: ");
                String local = scanner.nextLine();
                System.out.println("Equipo Visitante: ");
                String visitante = scanner.nextLine();
                System.out.println("Fecha: ");
                String fecha = scanner.nextLine();
                System.out.println("Ronda (ej. Octavos): ");
                String ronda = scanner.nextLine();
                PartidoPlayOff partido = new PartidoPlayOff(local, visitante, fecha, ronda);
                partidos.add(partido);
                System.out.println("Partido registrado!");
            }

            if (opcion == 3) {
                System.out.println("Numero de partido a finalizar (0 a " + (partidos.size() - 1) + "): ");
                int num = scanner.nextInt();
                if (num >= 0 && num < partidos.size()) {
                    System.out.println("Puntos Local: ");
                    int puntosL = scanner.nextInt();
                    System.out.println("Puntos Visitante: ");
                    int puntosV = scanner.nextInt();
                    partidos.get(num).registrarPuntosLocal(puntosL);
                    partidos.get(num).registrarPuntosVisitante(puntosV);
                    if (partidos.get(num).finalizarPartido()) {
                        System.out.println("Partido finalizado. Ganador: " + partidos.get(num).obtenerGanador());
                    }
                } else {
                    System.out.println("Numero invalido");
                }
            }

            if (opcion == 4) {
                System.out.println("Numero de partido a mostrar (0 a " + (partidos.size() - 1) + "): ");
                int num = scanner.nextInt();
                if (num >= 0 && num < partidos.size()) {
                    System.out.println(partidos.get(num).infoBasica());
                    System.out.println("Resultado: " + partidos.get(num).obtenerResultado());
                    if (partidos.get(num).finalizado) {
                        System.out.println("Ganador: " + partidos.get(num).obtenerGanador());
                    }
                } else {
                    System.out.println("Numero invalido");
                }
            }

        } while (opcion != 5);

        scanner.close();
    }
}