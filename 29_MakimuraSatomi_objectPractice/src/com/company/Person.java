package com.company;

public class Person {

    public String name;
    public String birthPlace;

    public Person(String input_name, String input_birthPlace){
        name = input_name;
        birthPlace = input_birthPlace;
    }

    public void getSelfIntroduction() {
        System.out.println("私の名前は" + name + "です。" + birthPlace + "出身");
    }
}