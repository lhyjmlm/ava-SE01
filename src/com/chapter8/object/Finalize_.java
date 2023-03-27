package com.chapter8.object;

public class Finalize_ {
    public static void main(String[] args) {

        Car bm = new Car("宝马");
        bm =null;

    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

}
