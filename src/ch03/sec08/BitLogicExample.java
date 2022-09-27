//비트연산자
package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        //AND(논리곱): &, 두 비트 모두 1일 경우에만 연산 결과가 1
        System.out.println("45 & 25 = " + (45 & 25));
        //OR(논리합): |, 두 비트 중 하나만 1이면 연산 결과는 1
        System.out.println("45 | 25 = " + (45 | 25));
        //XOR(배타적 논리합): ^, 두 비트 중 하나는 1이고 다른 하나가 0일 경우 연산 결과는 1
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        //NOT(논리 부정): ~, 보수
        System.out.println("~45 = " + (~45));

        System.out.println("-----------------------------");

        byte receiveData = -128;

        //방법1 : 비트 논리곱 연산으로 Unsigned 정수 얻기
        int unsignedInt1 = receiveData & 255;
        System.out.println(unsignedInt1);

        //방법2: 자바 API를 이용해서 Unsigned 정수 얻기
        int unsignedInt2 = Byte.toUnsignedInt(receiveData); //Byte.toUnsignedInt(): 논리곱(AND)과 같은 코드, 255로 비교
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte)test;
        System.out.println(btest);
    }
}
