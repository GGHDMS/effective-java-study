package me.effectivejavastudy.chapter01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 생성자로 여러 인스턴스 만들기
public class ElvisReflection {

    public static void main(String[] args) {
        try {
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor();
            defaultConstructor.setAccessible(true);
            Elvis.INSTANCE.sing();
            Elvis elvis1 = defaultConstructor.newInstance();
            Elvis elvis2 = defaultConstructor.newInstance();
            System.out.println(elvis1 == elvis2);
            System.out.println(elvis1 == Elvis.INSTANCE);
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException |
                 IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}
