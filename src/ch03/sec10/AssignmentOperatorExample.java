//대입 연산자
package ch03.sec10;

public class AssignmentOperatorExample {
    public static void main(String[] args) {
        int result = 0;
        result += 10;       //변수 = 변수 + 피연산자
        System.out.println("result = " + result);
        result -= 5;        //변수 = 변수 - 피연산자
        System.out.println("result = " + result);
        result *= 3;        //변수 = 변수 * 피연산자
        System.out.println("result = " + result);
        result /= 5;        //변수 = 변수 / 피연산자
        System.out.println("result = " + result);
        result %= 3;        //변수 = 변수 % 피연산자
        System.out.println("result = " + result);
    }
}
