//비트 이동 연산자
package ch03.sec09;

public class BitShiftExample1 {
    public static void main(String[] args) {
        int num1 = 1;
        //<<: 정수 num1의 각 비트를 3만큼 왼쪽으로 이동, 오른쪽 빈자리는 0으로 채움, num1 * 2³와 동일한 결과가 됨
        int result1 = num1 << 3;
        int result2 = num1 * (int)Math.pow(2, 3);   //2³을 연산하고, double 값을 산출
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);

        int num2 = -8;
        //>>: 정수 num2의 각 비트를 3만큼 오른쪽으로 이동, 왼쪽 빈자리는 최상위 부호 비트와 같은 값으로 채움, num2 / 2³와 동일한 결과가 됨
        int result3 = num2 >> 3;
        int result4 = num2 / (int) Math.pow(2, 3);
        System.out.println("result3: " + result3);
        System.out.println("result4: " + result4);
    }
}
