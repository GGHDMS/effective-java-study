package me.effectivejavastudy.chapter01.item01;

public class Settings {

    private boolean userAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    private Settings() {}

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance() {
        return SETTINGS;
    }



}
