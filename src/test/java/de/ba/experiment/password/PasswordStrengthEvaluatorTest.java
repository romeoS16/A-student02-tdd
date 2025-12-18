package de.ba.experiment.password;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;

public class PasswordStrengthEvaluatorTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void nullPassword_isWeak() {
        String result = PasswordStrengthEvaluator.evaluateStrength("ab1");
        assertEquals("WEAK", result);
    }
    
    @Test
    public void nullPassword() {
        String result = PasswordStrengthEvaluator.evaluateStrength(null);
        assertEquals("WEAK", result);
    }

    @Test
    public void emptyPassword() {
        String result = PasswordStrengthEvaluator.evaluateStrength("");
        assertEquals("WEAK", result);
    }
    @Test
    public void blankPassword() {
        String result = PasswordStrengthEvaluator.evaluateStrength(" ");
        assertEquals("WEAK", result);
    }

    @Test
    public void hasMinOneLower() {
        boolean result = PasswordStrengthEvaluator.hasLower("aaaAAAbbb!223j");
        assumeTrue(result);
    }

    @Test
    public void hasNoOneLower() {
        boolean result = PasswordStrengthEvaluator.hasLower("ASF2");
        assumeFalse(result);
    }



}
