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
        if (password == null || password.isEmpty() || password == " " || password.length() < 6) {
            return "WEAK";
        }
        char ch;
        int strongessLevel = 0;
        boolean capitalFlag = false;
        boolean lowerCaseFlag = false;
        boolean numberFlag = false;
        boolean specialFlag = false;
        for(int i=0;i < password.length();i++) {
            ch = password.charAt(i);
            if( Character.isDigit(ch)) {
                numberFlag = true;
            }
            else if (Character.isUpperCase(ch)) {
                capitalFlag = true;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseFlag = true;
            } else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+') {
                specialFlag = true;
            }
        }
        if (numberFlag) {
            strongessLevel++;
        }
        if (capitalFlag) {
            strongessLevel++;
        }
        if (lowerCaseFlag) {
            strongessLevel++;
        }
        if (password.length() < 9) {
            strongessLevel++;
        }
        if (specialFlag) {
            strongessLevel++;
        }



        if (strongessLevel == 3) {
            return "MEDIUM";
        } else if (strongessLevel >= 4) {
            return "STRONG";
        } else {
            return "WEAK";
        }
    }
}
