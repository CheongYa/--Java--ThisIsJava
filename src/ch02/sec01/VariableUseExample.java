// 변수 선언
package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        //변수 hour 선언 후 3으로 초기화
        int hour = 3;
        //변수 minute 선언 후 5로 초기화
        int minute = 5;
        System.out.println(hour + "시간 " + minute + "분");
        
        //변수 totalMinute 선언 후 변수 hour값에 60을 곱하고 변수 minute와 합한 값을 저장
        int totalMinute = (hour*60) + minute;
        System.out.println("총 " + totalMinute + "분");
    }
}
