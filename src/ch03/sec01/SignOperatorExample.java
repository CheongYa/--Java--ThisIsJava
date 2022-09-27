//부호/증감 연산자
package ch03.sec01;

public class SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        x = -x;     //부호 연산자 사용. x의 부호를 변경시킴.
        System.out.println("x: " + x);

        byte b = 100;
        int y = -b;
        System.out.println("y: " + y);
    }
}
