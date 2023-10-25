package me.effectivejavastudy.chapter01.item01;

import me.whiteship.hello.ChineseHelloService;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> System.out.println(h.hello()));

        ChineseHelloService helloService = new ChineseHelloService();
        System.out.println(helloService.hello());
    }
}
