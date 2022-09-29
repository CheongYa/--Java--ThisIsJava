//문자열(String) 타입(4)
package ch05.sec05;

public class LengthExample {
    public static void main(String[] args) {
        String ssn = "0011223456345";
        //변수.length: 문자열에서 문자의 개수를 얻을때 사용, 공백 포함
        int length = ssn.length();
        if(length == 13) {
            System.out.println("주민등록번호 자릿수가 맞습니다.");
        } else {
            System.out.println("주민등록번호 자릿수가 틀립니다.");
        }
    }
}
