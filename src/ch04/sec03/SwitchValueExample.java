//switch 문
package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        //Java 11 이전 문법
        int score1 = 0;
        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }
        System.out.println("score1: " + score1);

        //Java 12부터 가능
        int score2 = switch (grade) {
            case "A" -> 100;
            case "B" -> {           //중괄호를 사용할 경우 default가 반드시 존재해야 한다.
                int result = 100 - 20;
                //Java 13부터 가능
                yield result;       //중괄호를 사용할 경우에는 yield 키워드로 값을 지정한다.
            }
            default -> 60;
        };
        System.out.println("score2: " + score2);
    }
}
