package me.effectivejavastudy.chapter01.item05.dependencyinjection;

import org.junit.jupiter.api.Test;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(DictionaryFactory::get);
        spellChecker.isValid("test");
    }

}
