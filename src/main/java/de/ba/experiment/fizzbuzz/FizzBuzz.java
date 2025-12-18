package de.ba.experiment.fizzbuzz;

public class FizzBuzz {

    /**
     * Gibt für die Zahlen von 1 bis n jeweils einen String zurück.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param n die größe des Arrays
     * @return ein String-Array der Länge n mit den FizzBuzz-Werten
     */

    public static String[] fizzBuzz(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.toString(i + 1);
        }
        System.out.println(array);
        return array;
    }
}
