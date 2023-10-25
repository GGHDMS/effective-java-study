package me.effectivejavastudy.chapter01.item01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListQuiz {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(44);
        list.add(3);

        System.out.println(list);

        Comparator<Integer> desc = (o1, o2) -> o2 - o1;

        list.sort(desc);
        System.out.println(list);

        //기본 메서드
        list.sort(desc.reversed());
        System.out.println(list);
    }
}
