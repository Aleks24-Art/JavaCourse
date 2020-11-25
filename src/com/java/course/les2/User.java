package com.java.course.les2;

// private - виден только в классе
// public - виден везде и все его могут поторогать
// default (package-private) - виден всем в этой папке
// protected - виден всем в этой папке + классам наследкникам

class User {

    private String firstName;
    private String lastName;
    private int age;

    public User() {}

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public void speak() {
        System.out.println("My name is " + firstName + " " + lastName + " I am " + age + " y.o.");
    }

    public void walkAroundTheBeach() {
        // купить цветы
        // ...
        System.out.println("Walk with " + wearUnderwear());
    }

    private String wearUnderwear() {
        return "Underwear";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Такого не бывет");
            this.age = 18;
            return;
        }

        // Если выполнится ретурн — ничего из этого не выполнится
        this.age = age;

        // Some code...

    }
}
