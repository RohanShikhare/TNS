package com.tns.enums;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Demo {
    public static void main(String[] args) {
        Level obj = Level.MEDIUM;
        switch (obj) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}