// http://courses.caveofprogramming.com/courses/java-for-complete-beginners/lectures/38477
package com.rubytester.java.cave.generics;

import java.util.ArrayList;

class Machine {
    void start() {
        System.out.println("start machine...");
    }
}

class Camera extends Machine {
    void start() {
        System.out.println("start camera...");
    }
}


class AboutGenerics {
    public static void main(String[] args) {

        Machine m = new Machine();
        m.start();

        ArrayList<Machine> list = new ArrayList<>(); //generics thingi
        list.add(new Machine());
        list.add(new Camera());

        // list hold collection of Machine like objects

        showMachine(list);
        showWildcard(list);
        showUnknown(list);

    }

    // parameter must be ArrayList of Machines declared
    public static void showMachine(ArrayList<Machine> ms) {

        System.out.println("showMachine");
        for (Machine m : ms) {
            m.start();
        }
    }

    // any subclass of Machine but we operate on a known Machine. Isn't this a bit silly or redundant?
    public static void showWildcard(ArrayList<? extends Machine> ms) {

        System.out.println("showWildcard");
        for (Machine m : ms) {
            m.start();
        }
    }


    // any subclass of Machine but we operate on a known Machine. Isn't this a bit silly or redundant?
    public static void showUnknown(ArrayList<?> ms) {

        for (Object m : ms) { // ? stands for Unknown so we can only use Object type
            System.out.println(m.getClass());
        }
    }

}
