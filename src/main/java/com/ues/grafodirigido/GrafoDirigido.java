/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ues.grafodirigido;

/**
 *
 * @author Universidad
 */
import java.util.List;
import com.ues.grafodirigido.EntidadesGrafo.*;

public class GrafoDirigido {

    public static void main(String[] args) {
        try {

            Grafo g = new Grafo();

            g.addNodo("A");
            g.addNodo("B");
            g.addNodo("C");

            g.addArco("A", "B");
            g.addArco("B", "C");
            g.addArco("A", "C");

            List<Nodo> camino = g.buscarRuta("A", "C");

            if (camino == null) {
                System.out.println("Camino A -> C no encontrado");
            } else {
                System.out.println("Camino A -> C encontrado");
                for (Nodo nodo : camino) {
                    System.out.println(nodo.getNombre());
                }
            }
            System.out.println();

        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        try {

            Grafo g = new Grafo();

            g.addNodo("A");
            g.addNodo("B");
            g.addNodo("C");
            g.addNodo("D");
            g.addNodo("E");

            g.addArco("A", "B");
            g.addArco("B", "C");
            g.addArco("C", "D");
            g.addArco("E", "D");
            g.addArco("A", "C");

            List<Nodo> camino = g.buscarRuta("A", "E");

            if (camino == null) {
                System.out.println("Camino A -> E no encontrado");
            } else {
                System.out.println("Camino A -> E encontrado");
                for (Nodo nodo : camino) {
                    System.out.println(nodo.getNombre());
                }
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
