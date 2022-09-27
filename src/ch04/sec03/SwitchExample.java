//switch 문(1)
package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) +1;

        switch (num) {
            case 1:         //변수가 값1일 경우
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:         //변수가 값2일 경우
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println("3번이 나왔습니다.");
                break;
            case 4:
                System.out.println("4번이 나왔습니다.");
                break;
            case 5:
                System.out.println("5번이 나왔습니다.");
                break;
            default:        //변수가 모두 아닐 경우
                System.out.println("6번이 나왔습니다.");
        }
    }
}
