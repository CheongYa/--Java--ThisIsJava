//자동 타입 변환
package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환
        //기본 타입을 호용 범위 순으로 나열: byte < short, char < int < long < float < double
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}
//주의: char 타입보다 허용 범위가 작은 byte 타입은 char 타입으로 자동 변환될 수 없다.
//왜냐하면 char 타입의 허용 범위는 음수를 포함하지 않는데, byte 타입은 음수를 포함하기 때문이다.