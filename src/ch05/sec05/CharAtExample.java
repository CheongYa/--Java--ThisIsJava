//문자열(String) 타입(3)
package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "0011223456345";   //주민번호
        //변수.charAt: 문자열에서 특정 위치의 문자를 얻을때 사용
        char sex = ssn.charAt(6);
        switch(sex) {
            case '1':       //7번째 문자가 1이나 3이라면
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':       //7번째 문자가 2나 4라면
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
