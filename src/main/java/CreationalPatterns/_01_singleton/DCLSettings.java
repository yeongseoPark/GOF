package CreationalPatterns._01_singleton;

import java.io.Serializable;

public class DCLSettings implements Serializable {
    private static volatile DCLSettings instance; // volatile을 통해서 instance를 메인메모리에 유지

    private DCLSettings() {}

    /* Double checked Locking */
    public static DCLSettings getInstance() {
        if (instance == null) { // instance가 없는 경우에만 synchronized 가 걸려서 성능상 이점(메서드 선언부에 synchronized를 거는것보다)
            synchronized (DCLSettings.class) {
                if (instance == null) {
                    instance = new DCLSettings();
                }
            }
        }

        return instance;
    }

    /* 역직렬화 대응방안 : readResolve를 역직렬화시 사용하니, 이 메서드를 (명시적이진 않게) 오버라이딩 */
    protected Object readResolve() {
        return getInstance();
    }
}
