//논리연산자
package ch03.sec07;

public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';
        //int charcode = 'a';
        //int charCode = '5';

        if((65<=charCode) & (charCode<=90)) {       //AND(논리곱): && 또는 & 사용
            System.out.println("대문자이군요.");
        }

        if((97<=charCode) && (charCode<=57)) {
            System.out.println("소문자이군요.");
        }

        if((48<=charCode) && (charCode<=57)) {
            System.out.println("0~9 숫자이군요.");
        }

        //----------------------------------------------------------------------

        //int value = 6;
        int value = 7;

        if((value%2==0) | (value%3==0)) {       //OR(논리합): || 또는 | 사용
            System.out.println("2 또는 3의 배수이군요.");
        }

        boolean result = (value%2==0) || (value%3==0);
        if(!result) {       //NOT(논리 부정): !
            System.out.println("2 또는 3의 배수가 아니군요.");
        }
        /*
         이 외에 XOR(배타적 논리합): ^ 이 존재.
         하나는 true고 다른 하나라 false일 경우에만 연산 결과가 true
        */
    }
}
