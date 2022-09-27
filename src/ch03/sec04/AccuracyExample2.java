// 정확한 계산은 정수 연산으로
package ch03.sec04;

public class AccuracyExample2 {
    public static void main(String[] args) {
        //산술 연산을 정수 타입으로 한 예시
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number;
        System.out.println("10조각에서 남은 조각: " + result);
        System.out.println("사과 1개에서 남은 양: " + result/10.0);
    }
}
