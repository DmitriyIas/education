package mygame.shared;

public class Utilities {

    // set DEBUG = false and compile to stop debug messages
    private final static boolean DEBUG = true;

    public static void printMsg(String msg) {
        if (DEBUG) {
            System.out.println(msg);
        }
    }
}


