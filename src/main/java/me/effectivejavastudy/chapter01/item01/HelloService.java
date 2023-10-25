package me.effectivejavastudy.chapter01.item01;

public interface HelloService {
    String hello();

    // 입력 매개변수가 따라 매번 다른 클래스의 객체를 반환할 수 있다.
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
