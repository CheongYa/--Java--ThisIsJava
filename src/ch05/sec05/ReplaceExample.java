//문자열(String) 타입(5)
package ch05.sec05;

public class ReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
        String newStr = oldStr.replace("자바", "JAVA");
        //변수.replace: 문자열에서 특정 문자열을 다른 문자열로 대체하고 싶을때 사용

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
