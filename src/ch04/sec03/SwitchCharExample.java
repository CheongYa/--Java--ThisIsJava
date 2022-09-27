//switch 문(3)
package ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'b';

        switch (grade) {
            case 'A':       //변수가 A 또는 a일 경우
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':       //변수가 B 또는 b일 경우
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:        //변수가 모두 아닐 경우
                System.out.println("손님입니다.");
        }
    }
}
