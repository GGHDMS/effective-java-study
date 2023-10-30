package me.effectivejavastudy.chapter01.item02.builder;

import me.whiteship.chapter01.item02.builder.NutritionFacts;

public class BuilderTest {

    public static void main(String[] args) {
        new NutritionFacts.Builder(10, 10)
                .calories(10)
                .build();
    }
}
