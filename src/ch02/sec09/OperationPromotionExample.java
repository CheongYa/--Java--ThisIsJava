//연산식에서 자동 타입 변환
package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;         //컴파일 단계에서 연산
        System.out.println("result1: " + result1);

        byte v1 = 10;
        byte v2 = 20;
        //정수 리터럴이 아니라 변수가 피연산자로 사용되면 실행 시 연산을 수행한다.
        //정수 타입 변수가 산술 연산식에서 피연산자로 사용되면 int 타입보다 작은 byte, short 타입의 변수는 int타입으로 자동 타입 변환된다.
        int result2 = v1 + v2;          //int 타입으로 변환 후 연산
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        //만일 long 타입이 피연산자로 사용되면 다른 피연산자는 long 타입으로 변환된다.
        long result3 = v3 + v4 + v5;    //long 타입으로 변환 후 연산

        char v6 = 'A';
        char v7 = '1';
        int result4 = v6 + v7;          //int 타입으로 변환 후 연산
        System.out.println("result4: " + result4);
        System.out.println("result4: " + (char)result4);

        int v8 = 10;
        int result5 = v8/4;             //정수 연산의 결과는 정수임을 확인
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;      //double 타입으로 변환 후 연산
        //실수는 피연산자가 동일한 실수 타입이라면 해당 타입으로 연산이 된다.
        //하지만 하나라도 double 타입이면 다른 피연산자도 double 타입으로 변환되어 연산 된다.
        //int와 같은 정수 타입들도 마찬가지로 double 타입으로 자동 변환이 된다.
        System.out.println("result6: " + result6);

        //double을 int로 변형하고 싶다면 double 타입을 int 타입으로 강제 변환하면 사용이 가능하다.
        int v10 = 1;
        int v11 = 2;
        double result7 = (double) v10 / v11;    //double 타입으로 변환 후 연산
        System.out.println("result7: " + result7);
    }
}
