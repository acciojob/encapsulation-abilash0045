package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("Abilash");
        String name = obj.getName();
        System.out.println(name);
        // name has private access in com.driver.RWOnly
    }
}