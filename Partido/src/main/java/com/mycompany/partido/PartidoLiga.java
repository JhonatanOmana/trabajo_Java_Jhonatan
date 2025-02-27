/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partido;

/**
 *
 * @author Juliany
 */
class PartidoLiga extends Partido {
    int jornada;

    PartidoLiga(String equipoLocal, String equipoVisitante, String fecha, int jornada) {
        super(equipoLocal, equipoVisitante, fecha);
        this.jornada = jornada;
    }

    @Override
    String infoBasica() {
        return "Partido de Liga - Jornada " + jornada + ", Fecha: " + fecha + ", " + equipoLocal + " vs " + equipoVisitante + ", Finalizado: " + finalizado;
    }
}
