//switch 문(2)
package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int)(Math.random()*4) + 8;
        System.out.println("[현재 시간 : " + time + "시]");

        switch (time) {
            case 8:     //변수가 값 8일 경우
                System.out.println("출근합니다.");
            case 9:     //변수가 값 9일 경우
                System.out.println("회의를 합니다.");
            case 10:
                System.out.println("업무를 봅니다.");
            default:    //변수가 모두 아닐 경우
                System.out.println("외근을 나갑니다.");
        }
    }
}
