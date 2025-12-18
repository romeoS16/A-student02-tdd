package de.ba.experiment.password;

public class PasswordStrengthEvaluator {

    /**
     * Bewertet die Stärke eines Passworts.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param password das zu prüfende Passwort
     * @return "WEAK", "MEDIUM" oder "STRONG" nach Definition
     */

    public static String evaluateStrength(String password) {
        if (password == null || password.isEmpty() || password == " ") {
            return "WEAK";
        }
        if (password.length() < 8) {
            return "WEAK";
        }
        return "STRONG";
    }
}
