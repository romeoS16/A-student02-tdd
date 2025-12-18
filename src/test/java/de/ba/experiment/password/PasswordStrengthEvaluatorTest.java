package de.ba.experiment.password;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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




    // TODO: weitere Tests ergänzen
}
