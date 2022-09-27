//if 문(1)
package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score >= 90) {       //변수가 90 이상일 경우 실행
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }
        if(score < 90) {        //변수가 90 미만일 경우 실행
            System.out.println("점수가 90보다 작습니다.");
        }
            System.out.println("등급은 B입니다.");    //중괄호 밖에 있어 if문과는 상관없는 실행문
    }
}
