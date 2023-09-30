package CreationalPatterns._01_singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {

        /* 싱글톤 깨트리기 1 : Reflection 을 사용하여 싱글톤이 깨지는 (새로운) 인스턴스 생성 */
        StaticInnerSettings instance1 = StaticInnerSettings.getInstance();

        Constructor<StaticInnerSettings> constructor = StaticInnerSettings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerSettings instance2 = constructor.newInstance();

        System.out.println(instance1 == instance2);

        /* 싱글톤 깨트리기 2 : 직렬화와 역직렬화 */
        DCLSettings settings = DCLSettings.getInstance();
        DCLSettings settings2;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings); // 객체를 직렬화해서 파일로 작성
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings2 = (DCLSettings) in.readObject(); // 역직렬화시 생성자를 사용해서 객체를 생성함
        }

        // 싱글톤 깨지는 문제 readResolve() 오버라이드로 대응 가능
        System.out.println(settings == settings2);

        /* 싱글톤 깨트리기 대응방안 : ENUM 사용... 직렬화와 역직렬화에도 안전함.
        - 단 ENUM은 클래스로딩시 미리 만들어짐(Lazy Loading불가), Enum은 Enum만 상속 가능하다는 문제점 존재.
        - ENUM과 StaticInner가 싱글톤 사용시 권장됨! */
        Settings e1 = Settings.INSTANCE;

        Settings e2 = null;
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            declaredConstructor.setAccessible(true);
            e2 = (Settings) declaredConstructor.newInstance("INSTANCE"); // enum은 Reflection에서 newInstance할 수 없게 막아놓음
        }

        System.out.println(e1 == e2);
    }
}
