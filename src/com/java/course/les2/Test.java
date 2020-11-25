package com.java.course.les2;

public class Test {

    public static void main(String[] args) {
        User user = new User();

        //user.age = 18;
        //user.firstName = "Ivan";
        //user.lastName = "Ivanov";

        user.setAge(-18);
        user.setFirstName("PornHub");
        user.setLastName(".com");

        user.walkAroundTheBeach();

        user.speak();
    }
}
