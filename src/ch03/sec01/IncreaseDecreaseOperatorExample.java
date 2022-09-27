//부호/증감 연산자
package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;        //피연산자++: 다른 연산을 수행한 후에 피연산자의 값을 1 증가시킴
        ++x;        //++피연산자: 피연산자의 값을 1 증가시킴
        System.out.println("x=" + x);

        System.out.println("----------------------");
        y--;        //피연산자--: 다른 연산을 수행한 후에 피연산자의 값을 1 감소시킴
        --y;        //--피연산자: 피연산자의 값을 1 감소시킴
        System.out.println("y=" + y);

        System.out.println("----------------------");
        z = x++;
        System.out.println("x=" + x);
        System.out.println("z=" + z);

        System.out.println("----------------------");
        z = ++x;
        System.out.println("x=" + x);
        System.out.println("z=" + z);

        System.out.println("----------------------");
        z = ++x + y++;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
