//문자 타입
package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';  //문자 저장
        char c2 = 65;   //유니코드 직접 저장
        char c3 = '가';
        char c4 = 44032;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}
//주의: 초기화만 할 목적으로 char c = ''과 같이 따옴표 두 개를 연달아 붙인 빈 문자를 대입하면 에러가 발생한다.
//이 경우에는 공백(유니코드:32) 하나를 포함해서 초기화해야 한다.