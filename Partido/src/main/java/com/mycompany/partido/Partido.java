/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partido;

/**
 *
 * @author Juliany
 */
public class Partido {

    String equipoLocal;
    String equipoVisitante;
    int cestasLocal;
    int cestasVisitante;
    boolean finalizado;
    String fecha;

    Partido(String equipoLocal, String equipoVisitante, String fecha) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.cestasLocal = 0;
        this.cestasVisitante = 0;
        this.finalizado = false;
        this.fecha = fecha;
    }
    String obtenerResultado() {
        return equipoLocal + " " + cestasLocal + " - " + cestasVisitante + " " + equipoVisitante;
    }

    void registrarPuntosLocal(int puntos) {
        cestasLocal += puntos;
    }

    void registrarPuntosVisitante(int puntos) {
        cestasVisitante += puntos;
    }

    String obtenerGanador() {
        if (cestasLocal > cestasVisitante) {
            return equipoLocal;
        } else if (cestasVisitante > cestasLocal) {
            return equipoVisitante;
        } else {
            return "Empate";
        }
    }

    boolean finalizarPartido() {
        finalizado = true;
        return true;
    }

    String infoBasica() {
        return "Fecha: " + fecha + ", " + equipoLocal + " vs " + equipoVisitante + ", Finalizado: " + finalizado;
    }
}



