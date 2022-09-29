//null과 NulPointerException(1)
package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        //intArray[0] = 10;     //NullPointerException 발생
        //intArray가 참조하는 배열 객체가 없으므로 10을 저장할 수 없음

        String str = null;
        //System.out.println("총 문자 수: " + str.length());    //NullPointerException 발생
        //str 변수가 참조하는 String 객체가 없으므로 문자열의 길이를 구할 수 없음
    }
}
