//문자열(String) 타입(2)
package ch05.sec05;

public class EmptyStringExample {
    public static void main(String[] args) {
        String hobby = "";      //빈 문자열 대입 가능
        //String 객체로 생성되기 때문에 변수가 빈 문자열을 참조하는지조사하려면 equals() 메소드를 사용
        if(hobby.equals("")) {
            System.out.println("hobby 변수가 참조하는 String 객체는 빈문자열");
        }
    }
}
