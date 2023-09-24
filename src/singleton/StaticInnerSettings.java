package singleton;


public class StaticInnerSettings {
    private StaticInnerSettings() { }

    /* 정적 내부 클래스는 참조되는 시점에 로드됨 */
    private static class SettingsHolder {
        private static final StaticInnerSettings INSTANCE = new StaticInnerSettings();
    }

    public static StaticInnerSettings getInstance() { // getInstance 호출시 static class가 로딩(Lazy Loading)
        return SettingsHolder.INSTANCE;
    }
}
