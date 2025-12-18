package de.ba.experiment.palindrome;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeCheckerTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void simpleLowercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("anna");
        assertTrue(result);
    }

    @Test
    public void simpleUppercasePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("ANNA");
        assertTrue(result);
    }

    @Test
    public void simpleUngeradePalindrome_returnsTrue() {
        boolean result = PalindromeChecker.isPalindrome("ANkNA");
        assertTrue(result);
    }

}
