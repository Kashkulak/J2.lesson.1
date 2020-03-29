package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Хатико");
        dog1.setBreed("Хаски");
        dog1.setAge(3);
        dog1.setColor(Color.GRAY);
        dog1.setCommands(new String[]{"стоять", "прыгать", "дай лапу"});
        dog1.setShelter(new Shelter("Приют №1", "Советская 66"));
        System.out.println(dog1.getInfo());
        dog1.makeVoice(5);

        Dog dog2 = new Dog("Том","Алабай",Color.BLACK,new Shelter ("Приют №2","Токтогула 45"));
        System.out.println(dog2.getInfo());
        dog2.makeVoice("Гав-гав");

        Dog dog3 = new Dog("Рэкс","Овчарка", Color.BROWN,new Shelter("Приют №3","Ахунбаева 12"));
        System.out.println(dog3.getInfo());
        dog3.makeVoice("Ауууу!",3);


    }
}