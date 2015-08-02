// http://courses.caveofprogramming.com/courses/java-for-complete-beginners/lectures/38470
package com.rubytester.java.cave.interfaces;

// behavior. in ruby this would be Infoable, InfoAskable, HasInfo etc..
interface Info {

    // force classes that implement this interface to provide this method's implementation
    // similar to abstract method
    void info();
/**
    //this is not permitted. Interface must not have implementation
    void info(){
        // implementation
    }
*/

}

class Person implements Info {

    // and here we implement info from Info interface
    @Override
    public void info() {
        System.out.println("I am a Person");
    }
}

class Machine implements Info {

    // and this one too.
    @Override
    public void info() {
        System.out.println("I am a Machine");
    }
}


public class AboutInterfaces {

    public static void main(String[] args) {

        // examples of calling info method that comes from interface
        // interfaces act like inheritance of course
        Person person = new Person();
        person.info();

        Machine machine = new Machine();
        machine.info();
    }

}
