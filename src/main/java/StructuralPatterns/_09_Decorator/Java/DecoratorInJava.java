package StructuralPatterns._09_Decorator.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DecoratorInJava {

    public static void main(String[] args) {
        /* Collection이 제공하는 Decorator 메서드 */

        ArrayList list = new ArrayList<>();
        list.add(new Book());

        // 타입 체크
        List books = Collections.checkedList(list, Book.class);

        list.add(new Item());
//        books.add(new Item()); // type casting error

        List s = Collections.unmodifiableList(list);
        s.add(new Book()); // Unmodifiable
    }

    private static class Book {

    }

    private static class Item {

    }
}
