//삼항(조건) 연산자
package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        /*
        조건식(피연산자1) ? 값 또는 연산식(피연산자2) : 값 또는 연산식(피연산자3)
        ? 앞의 연산자는 boolean 변수 또는 조건식이 오므로 조건 연산자라고도 함.
        이 값이 true이면 콜론(:) 앞의 피연산자가 선택, false이면 콜론 뒤의 피연산자가 선택
         */
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
