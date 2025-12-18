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
        if (n == 1) {
            return new String[]{"1"};
        }
        for (int i = 0; i < n; i++) {
            if ((i+1 % 3) == 0) {
                array[i] = "Fizz, ";
                continue;
            }
            array[i] = Integer.toString(i + 1) + ", ";
        }
        System.out.println(array);
        return array;
    }
}
