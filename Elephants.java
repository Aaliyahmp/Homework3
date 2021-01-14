package com.tts;

public class Elephants {
    private int age;
    private String name;
    private int weight;


    public Elephants() {

    }

    public Elephants(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public Elephants(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void age() {
        System.out.println(5);
    }

    public void drive(int age, String name) {
        System.out.println("The Elephant is " + age + "years old and its name is " + name + ".");

    }
}
