//생성자 선언과 호출(2) - 필드 초기화
package ch06.sec06.exam02;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean 객체 생성
        Korean k1 = new Korean("김청야", "001122-1234567");
        //Korean 객체 데이터 읽기
        System.out.println("k1.nation: " + k1.nation);
        System.out.println("k1.name: " + k1.name);
        System.out.println("k1.ssn: " + k1.ssn);
        System.out.println();

        //또 다른 Korean 객체 생성
        Korean k2 = new Korean("박청야", "990123-2345678");
        //또 다른 Korean 객체 데이터 읽기
        System.out.println("k2.nation: " + k2.nation);
        System.out.println("k2.name: " + k2.name);
        System.out.println("k2.ssn:" + k2.ssn);
    }
}
