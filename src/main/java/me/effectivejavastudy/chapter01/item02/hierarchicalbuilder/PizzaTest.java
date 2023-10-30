package me.effectivejavastudy.chapter01.item02.hierarchicalbuilder;


import me.whiteship.chapter01.item02.hierarchicalbuilder.Calzone;
import me.whiteship.chapter01.item02.hierarchicalbuilder.NyPizza;

import static me.whiteship.chapter01.item02.hierarchicalbuilder.NyPizza.Size.SMALL;
import static me.whiteship.chapter01.item02.hierarchicalbuilder.Pizza.Topping.*;

// 계층적 빌더 사용 (21쪽)
public class PizzaTest {
    public static void main(String[] args) {
        me.whiteship.chapter01.item02.hierarchicalbuilder.NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION).build();

        me.whiteship.chapter01.item02.hierarchicalbuilder.Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
