
package com.mycompany.juegopiedrapapeltijeralagartospock;
import java.util.Scanner;
import java.util.Arrays;
public class JuegoPiedrapapeltijeralagartoSpock {
    public static void main(String[] args) {
        String[] opciones = {"piedra", "papel", "tijera", "lagarto", "Spock"};
        int indiceComputadora = (int) (Math.random() * opciones.length);
        String opcionComputadora = opciones[indiceComputadora];
        Scanner scanner = new Scanner(System.in);
        String opcionUsuario;

        do {
            System.out.print("Elige una opción (piedra, papel, tijera, lagarto, Spock): ");
            opcionUsuario = scanner.nextLine().toLowerCase();
        } while (!Arrays.asList(opciones).contains(opcionUsuario));

        if (opcionUsuario.equals(opcionComputadora)) {
            System.out.println("Empate");
        } else if ((opcionUsuario.equals("piedra") && (opcionComputadora.equals("tijera") || opcionComputadora.equals("lagarto"))) ||
                (opcionUsuario.equals("papel") && (opcionComputadora.equals("piedra") || opcionComputadora.equals("Spock"))) ||
                (opcionUsuario.equals("tijera") && (opcionComputadora.equals("papel") || opcionComputadora.equals("lagarto"))) ||
                (opcionUsuario.equals("lagarto") && (opcionComputadora.equals("papel") || opcionComputadora.equals("Spock"))) ||
                (opcionUsuario.equals("Spock") && (opcionComputadora.equals("piedra") || opcionComputadora.equals("tijera")))) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
    }
}
}
