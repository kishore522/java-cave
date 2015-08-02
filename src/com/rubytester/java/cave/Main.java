// CaveOfProgramming Java learning. http://courses.caveofprogramming.com/courses/java-for-complete-beginners

package com.rubytester.java.cave;

import java.lang.reflect.Method;

class Person {}


public class Main {

    public static void main(String[] args) {
	// write your code here

        Person p = new Person();

        Method[] methods = Person.class.getMethods();

        System.out.println(methods.length);

        for(Method m : methods){
            System.out.println(m.getName());
        }


    }
}
