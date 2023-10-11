package StructuralPatterns._011_flyweight.java;

public class FlyweightInJava {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10000); // -128~127의 값을 Caching
        Integer i2 = Integer.valueOf(10000);
        System.out.println(i1.equals(i2));// 레퍼런스 비교X 값 비교
        System.out.println(i1 == i2);
    }
}
