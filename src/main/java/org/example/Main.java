package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int nombre = 17;
        aff_estPremier(nombre);

    }
    public static void aff_estPremier(int nombre) {
        if (estPremier(nombre)) {
            System.out.println(nombre + " est un nombre premier.");
        }
        else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }

    public static boolean estPremier(int nombre) {
        // Vérifier si le nombre est inférieur à 2
        if (nombre < 2) {
            return false;
        }
        // Vérifier si le nombre est divisible par un nombre autre que 1 et lui-même
        for (int i = 2; i <= Math.sqrt(nombre); i++) {
            if (nombre % i == 0) {
                return false;
            }
        }
        // Si aucune condition n'est vérifiée, le nombre est premier
        return true;
    }
}