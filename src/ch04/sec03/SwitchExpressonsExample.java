//switch 문
package ch04.sec03;

public class SwitchExpressonsExample {
    public static void main(String[] args) {
        char grade = 'B';

        //Java 12 이후에 사용 가능. 표현식(Expressions)을 사용해 break 문을 없애는 대신 화살표와 중괄호를 사용.
        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> {
                System.out.println("손님입니다.");
            }
        }

        switch (grade) {
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}
