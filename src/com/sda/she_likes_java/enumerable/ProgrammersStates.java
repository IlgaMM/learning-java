package com.sda.she_likes_java.enumerable;

public enum ProgrammersStates {
    GOD_MODE("I can do everything"),
    EXHAUSTED("Bang the wall"),
    NORMAL("Life is good");

    String description;

    public String getDescription() {
        return description;
    }

    ProgrammersStates(String description) {
        this.description = description;
    }
}
