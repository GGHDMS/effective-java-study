package me.effectivejavastudy.chapter01.item01;

//기본 메소드 (default method)와 정적 메소드를 가질 수 있다.
public interface HelloService {
    String hello();

    default String hi() {
        return "hi";
    }

    default String bye() {
        return "bye";
    }

    private static void prepareMessage() {

    }

    static String hi1() {
        prepareMessage();
        return "hi";
    }

    static String hi2() {
        prepareMessage();
        return "hi";
    }

    static String hi3() {
        prepareMessage();
        return "hi";
    }

    // 입력 매개변수가 따라 매번 다른 클래스의 객체를 반환할 수 있다.
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}
