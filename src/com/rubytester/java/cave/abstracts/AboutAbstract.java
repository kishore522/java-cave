// http://courses.caveofprogramming.com/courses/java-for-complete-beginners/lectures/38483

package com.rubytester.java.cave.abstracts;

// prevent user from instantiating this class by turning it into abstract class
abstract class Machine {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // abstract class can have abstract methods
    // this forces every subclass to implemented start method
    // But this class does not provide default implementation
    abstract void start();


    // default implementation that happens to call abstract method in the body
    void run() {
        /// do some stuff and
        System.out.println("Run method in Machine abstract class");
        // call abstract method
        start();
    }

}

//type of machine
class Camera extends Machine {

    // you are forced to implement start method because it's declared as abstract start in abstract Machine class
    @Override
    void start() {
        System.out.println("start Camera");
    }
}

public class AboutAbstract {

    public static void main(String[] args) {

        Camera cam = new Camera();
        cam.setId(3);

        // this is not permitted
        // Machine m = new Machine(); //abstract class can not be instantiated

        cam.run();

    }

}