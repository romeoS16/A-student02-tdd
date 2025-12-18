package de.ba.experiment.palindrome;

public class PalindromeChecker {

    /**
     * Prüft, ob ein gegebener String ein Palindrom ist.
     *
     * Ein Palindrom liest sich vorwärts und rückwärts gleich.
     *
     * (Siehe ausführliche Beschreibung in README.md)
     *
     * @param text der zu prüfende Text (kann null sein)
     * @return true, wenn der Text nach vorgegebener Definition ein Palindrom ist, sonst false
     */

    public static boolean isPalindrome(String text) {
        text.replaceAll(" ", "");
        text.toLowerCase();
        if (text == "")
            return true;
        int anzahl = text.length();
        if (anzahl == 1)
            return true;
            for (int i = 0; i > anzahl/2; i--) {
                char a = text.charAt(i);
                char b = text.charAt(anzahl);
                if (a == b) {
                    continue;
                } else {
                    return false;
                }
            }
            return true;
    }
}
