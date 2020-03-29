package com.company;

import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        super.setColor(color);
        super.setShelter(shelter);
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(int number) {
        System.out.println("Собака подала голос " + number + " раз");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    @Override
    public final String getInfo() {
        return "\nИмя собаки: " + name + super.getInfo() + "\nПарода: " + breed + "\nКоманды: " + Arrays.toString(commands);
    }
}
