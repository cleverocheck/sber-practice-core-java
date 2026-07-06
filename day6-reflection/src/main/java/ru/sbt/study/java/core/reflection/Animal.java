package ru.sbt.study.java.core.reflection;

import java.util.Map;

class Animal {

    private String title;
    private boolean isAvailable;
    private boolean isSold;
    private Map<String, String> photosMap;

    public String toString() {
        return "Animal{" +
                "title='" + title + '\'' +
                ", isAvailable=" + isAvailable +
                ", isSold=" + isSold +
                ", photosMap=" + photosMap +
                '}';
    }
}
