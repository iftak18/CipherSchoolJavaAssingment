package Cipher;
import java.util.*;

class customException extends Exception {

    @Override
    public String getMessage() {
        return "String not allowed";
    }

}

class A {

    public <T> void generic(T... args) {
        int n = (args.length * 2) / 3;
        try {

            for (T i : args) {
                if (i instanceof String) {
                    throw new customException();
                }
            }

            for (int i = 0; i <=n; i++) {
                System.out.println(args[i]);
            }
        } catch (customException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Question8 {

    public static void main(String[] args) {
        A obj = new A();

        obj.generic(1,2,3,4);

        obj.generic("A","B","cd");
    }

}