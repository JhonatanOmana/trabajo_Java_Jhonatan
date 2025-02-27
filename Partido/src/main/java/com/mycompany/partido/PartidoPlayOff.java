/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partido;

/**
 *
 * @author Juliany
 */
class PartidoPlayOff extends Partido {
    String ronda;

    PartidoPlayOff(String equipoLocal, String equipoVisitante, String fecha, String ronda) {
        super(equipoLocal, equipoVisitante, fecha);
        this.ronda = ronda;
    }

    @Override
    boolean finalizarPartido() {
        if (cestasLocal == cestasVisitante) {
            System.out.println("No se puede finalizar, hay empate en PlayOffs");
            return false;
        } else {
            finalizado = true;
            return true;
        }
    }

    @Override
    String infoBasica() {
        return "Partido de PlayOff - Ronda " + ronda + ", Fecha: " + fecha + ", " + equipoLocal + " vs " + equipoVisitante + ", Finalizado: " + finalizado;
    }
}