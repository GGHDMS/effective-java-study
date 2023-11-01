package me.effectivejavastudy.chapter01.item05.factorymethod;


import me.effectivejavastudy.chapter01.item05.Dictionary;
import me.effectivejavastudy.chapter01.item05.MockDictionary;

public class MockDictionaryFactory implements DictionaryFactory {
    @Override
    public Dictionary getDictionary() {
        return new MockDictionary();
    }
}
