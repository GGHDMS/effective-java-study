package me.effectivejavastudy.chapter01.item05.dependencyinjection;

import me.effectivejavastudy.chapter01.item05.DefaultDictionary;
import me.effectivejavastudy.chapter01.item05.Dictionary;

public class DictionaryFactory {

    public static Dictionary get() {
        return new DefaultDictionary();
    }
}
