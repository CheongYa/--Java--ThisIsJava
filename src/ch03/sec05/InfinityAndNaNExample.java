//나눗셈 연산 후 NaN과 Infinity 처리
package ch03.sec05;

public class InfinityAndNaNExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
        //double z = x % y;

        //잘못된 코드
        System.out.println(z + 2);

        //알맞은 코드
        //변수값이 Infinity 또는 NaN일 경우 true를, 그렇지 않다면 false를 출력
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
