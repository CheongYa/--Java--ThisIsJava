//정수 타입
package ch02.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 20L;
//        long var3 = 10000000000;
        //기본적으로 컴파일러는 정수 리터럴을 int 타입 값으로 간주하기 때문에 int 타입의 허용 범위를 초과하는 리터럴 뒤에는
        //소문자 'l'이나 대문자'L'을 붙여 long 타입 값임을 컴파일러에게 알려주어야 한다.
        long var4 = 10000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var4);
    }
}
