package Cipher;
import java.util.*;

class ComplexNum {
    int rl, img;

    ComplexNum(int rl, int img) {
        this.rl = rl;
        this.img = img;
    }
    void add(ComplexNum num) {
        int a = this.rl + num.rl;
        int b = this.img + num.img;
        System.out.println(a + "+" + b+"i");
    }

    void sub(ComplexNum num) {
        int a = this.rl - num.rl;
        int b = this.img - num.img;
        System.out.println(a + "+" + b+"i");
    }

    void mul(ComplexNum num){
        int a = this.rl * num.rl;
        int b = this.img * num.img;
        System.out.println(a +"+"+ b+"i");
    }

}
public class Question5 {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(1, 6);
        ComplexNum num2 = new ComplexNum(8, 2);
        num1.add(num2);
        num2.sub(num1);
        num1.mul(num2);
    }
}

