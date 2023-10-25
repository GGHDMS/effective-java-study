package me.effectivejavastudy.chapter01.item01;

import me.whiteship.hello.ChineseHelloService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다.
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> System.out.println(h.hello()));

        ChineseHelloService helloService = new ChineseHelloService();
        System.out.println(helloService.hello());

        Class<?> aClass = Class.forName("me.whiteship.hello.ChineseHelloService");
        Constructor<?> constructor = aClass.getConstructor();
        HelloService o = (HelloService) constructor.newInstance();

        System.out.println(o.hello());
    }
}
