package me.effectivejavastudy.chapter01.item05.dependencyinjection;

import me.effectivejavastudy.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
        spellChecker.isValid("test");
    }

}
