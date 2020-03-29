package com.company;


public class Pet {
    private int age= generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter shelter(){
        return shelter;
    }

    public void setShelter(Shelter shelter){
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        return (int) (Math.random()*10+5);
    }

    public String getInfo (){
        return "\nВозраст: "+age +"\nЦвет: "+color+"\nПриют: "+shelter.getName()+" "+shelter.getAddress();
    }
}
