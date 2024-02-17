package org.example;

public class Animal {

    private int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Lion extends Animal{
    protected void setProperties(int age, String n){
        setAge(age);
        name = n;
    }

    public void roar(){
        System.out.println(name + " , age "+ getAge() + " , says: Roar!");
    }

    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }
}
