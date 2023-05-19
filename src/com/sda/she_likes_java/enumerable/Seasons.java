package com.sda.she_likes_java.enumerable;
//enum is class with restricted number of instances
public enum Seasons {
    WINTER(-5,"Skiing"),
    SUMMER(25,"swimming"),
    SPRING(10,"sleeping"),
    AUTUMN(5,"walking");

    private int averageTemp;
    private String activity;

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    Seasons(int averageTemp,String activity) {
        this.averageTemp = averageTemp;
        this.activity = activity;
    }
}
