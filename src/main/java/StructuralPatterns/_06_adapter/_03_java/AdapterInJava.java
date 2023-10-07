package StructuralPatterns._06_adapter._03_java;

import java.io.*;
import java.util.*;

public class AdapterInJava {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c"); // 배열을 리스트로 변환

        Enumeration<String> enumeration = Collections.enumeration(strings); // 리스트를 Enumeration으로 변환
        /* Adaptee : strings라는 리스트
        *  Adapter : Collections.enumerations
        *  타겟 인터페이스 : Enumeration 타입
        *  */

        // 위와 반대
        ArrayList<String> list = Collections.list(enumeration);

        /* I/O 예시 */
        try(InputStream is = new FileInputStream("input.txt"); // String을 줬는데 원하는 타겟 인터페이스인 InputStream이 나옴. 어댑터는 FileInputStream
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)) {
                while(reader.ready()) {
                    System.out.println(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
        }

    }
}
