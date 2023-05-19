package com.sda.she_likes_java.enumerable;

public class ProgrammersStatesClass {
   public static final ProgrammersStatesClass GOD_MODE =
           new ProgrammersStatesClass ("I can do everything");
    public static final ProgrammersStatesClass EXHAUSTED =
            new ProgrammersStatesClass("Bang the wall");
    public static final ProgrammersStatesClass NORMAL =
            new ProgrammersStatesClass("Life is good");

    String description;

    public String getDescription() {
        return description;
    }

    ProgrammersStatesClass(String description) {

        this.description = description;
    }
}
