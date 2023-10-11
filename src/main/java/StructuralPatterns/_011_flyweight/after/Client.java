package StructuralPatterns._011_flyweight.after;

public class Client {
    /* FlyWeight Pattern : 자주 변하는것과 자주 변하지 않는 것 분리 후 재사용 -> 메모리 사용 줄임 */

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12")); // 위랑 Instance 공유
        Character c3 = new Character('l', "white", fontFactory.getFont("godic:13"));
    }
}
