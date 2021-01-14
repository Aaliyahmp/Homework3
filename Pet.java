package com.tts;

public class Pet {
    private String petName;
    private int petAge;
    private String location;
    private String petType;

    public Pet() {
        petName = "default name";
        location = "default location";
        petType = "default type";


    }

    public Pet(String petName, int petAge, String petType, String location) {
        this.petName = petName;
        this.petAge = petAge;
        this.petType = petType;
        this.location = location;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetType() {
        return petType;
    }


    public void petAge() {
        System.out.println("pet age");
    }

    public void petName() {
        System.out.println("name of pet");
    }

    public void location() {
        System.out.println("location of pet");
    }

    public void petType() {
        System.out.println("type of pet");
    }

    public void drive(int petAge, String petName) {
        System.out.println("The pet is " + petAge + "years old and its name is " + petName + ".");
    }
}
