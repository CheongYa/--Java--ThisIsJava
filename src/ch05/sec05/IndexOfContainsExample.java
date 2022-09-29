//문자열(String) 타입(7)
package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        //변수.indexOf: 문자열에서 특정 문자열의 위치를 찾고자 할 때 사용
        int location = subject.indexOf("프로그래밍");    //"프로그래밍" 문자열의 인덱스 위치가 3번
        System.out.println(location);
        String substring = subject.substring(location); //location 변수에는 3이 저장되어 있음
        System.out.println(substring);

        location = subject.indexOf("자바");   //"자바" 문자열의 인덱스 위치 0번
        if(location != -1){     //-1이 아니라면
            System.out.println("자바와 관련된 책이군요.");
        }else {
            System.out.println("자바와 관련 없는 책이군요.");
        }

        //contains: 주어진 문자열이 단순히 포함되어 있는지만 조사할 때 사용
        boolean result = subject.contains("자바");
        if(result) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련 없는 책이군요.");
        }
    }
}
