package com.sda.she_likes_java.static_modifier;

public class WashMachineFactory {
    public static void main(String[] args) {
        WashMachine samsung = new WashMachine("Samsung", "1x2");
        System.out.println("current population number is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung serial number is : " +samsung.getSerialNumber());
        samsung.setSerialNumber(5);
        samsung.setNumberOfCreatedMachines(1000);

        //do not yse instance references to static members (fields/methods)
        //neizmantojiet instanču atsauces uz statiskiem dalībniekiem (lauki/metodes)


        WashMachine samsung2 = new WashMachine("Samsung", "1x2");
        System.out.println("current population number is: " + WashMachine.getNumberOfCreatedMachines());
        System.out.println("samsung serial number is : " +samsung2.getSerialNumber());

        for (int i = 0; i < 10; i++) {
            makeSomeWashMachines();
        }
        System.out.println("Hey we've made lots of wash machines: " + WashMachine.getNumberOfCreatedMachines());
    }

    public static void makeSomeWashMachines() {
        new WashMachine("LG","1111");
        new WashMachine("LG","1112151");
        new WashMachine("LG","111111");
        new WashMachine("LG","1118951");
        new WashMachine("LG","111895ef1");
    }
}
