//연산식에서 자동 타입 변환
package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        //숫자 연산
        //+는 피연산가자 모두 숫자일 경우에는 덧셈 연산을 수행한다
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1);

        //결합 연산
        //+는 피연산자 중 하나가 문자열인 경우엔 나머지 피연산자도 문자열로 자동 변환되어 문자열 결합 연산을 수행한다.
        String result2 = 10 + 2 + "8";  //10과 2가 먼저 덧셈 연산으로 수행되고 문자열인 8이 뒤에 붙는다. 128 출력.
        System.out.println("result2: " + result2);

        String result3 = 10 + "2" + 8;  //10 이후에 문자열인 2가 붙고 이후에도 문자열로 취급되어 8이 붙는다. 1028출력.
        System.out.println("result3: " + result3);

        String result4 = "10" + 2 + 8;  //문자열인 10 이후에도 문자열로 취급되어 2와 8이 문자열로 변환된다. 1028출력.
        System.out.println("result4: " + result4);

        String result5 = "10" + (2 + 8);    //( )가 최우선으로 연산이 수행되어 2와 8이 더해진 후 문자열인 10과 결합된다. 1010출력.
        System.out.println("result5: " + result5);
    }
}
