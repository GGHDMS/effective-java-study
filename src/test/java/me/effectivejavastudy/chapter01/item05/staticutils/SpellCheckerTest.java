package me.effectivejavastudy.chapter01.item05.staticutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SpellCheckerTest {

    @Test
    void test() {
        assertTrue(SpellChecker.isValid("test"));
    }

}
