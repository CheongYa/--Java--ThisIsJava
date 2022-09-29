//문자열(String) 타입(6)
package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String ssn = "001122-3456345";

        //substring: 문자열에서 특정 위치의 문자열을 잘라내어 가져오고 싶을때 사용
        /**
         * substring(int beginIndex): beginIndex에서 끝까지 잘라내기
         * substring(int beginIndex,int endIndex): beginIndex에서 endIndex 앞까지 잘라내기
         */
        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
