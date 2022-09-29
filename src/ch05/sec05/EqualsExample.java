//문자열(String) 타입(1)
package ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "김청야";
        String strVar2 = "김청야";

        //문자열 리터럴이 동일하다면 String 객체를 공유하도록 설계되어있음
        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");     //출력
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        //동일한 String 객체든 다른 String 객체든 상관없이 내부 문자열만을 비교할 경우
        //String 객체의 equals() 메소드를 사용 / 원본 문자열.equals(비교 문자열)
        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        //new 연산자는 새로운 객체를 만드는 연산자로 객체 생성 연산자
        //이 경우 서로 다른 String 객체의 번지를 가지게 됨
        String strVar3 = new String("김청야");
        String strVar4 = new String("김청야");

        if(strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");     //출력
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 stVar4는 문자열이 같음");
        }
    }
}
