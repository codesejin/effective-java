package org.example.item01;

/**
 * 환경설정
 * 스테틱 메소드가 나오는지 확인용
 */
public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Person person;

    private Settings() {}

    public Settings(boolean useAutoSteering, boolean useABS, Person person) {
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.person = person;
    }

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance() {
        return SETTINGS;
    }
}
