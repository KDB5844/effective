package com.study.effective.chapter01;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    /**
     * 객체 생성을 제어할 수 있다.
     * @return
     */
    public static Settings getInstance() {
        return SETTINGS;
    }
}
