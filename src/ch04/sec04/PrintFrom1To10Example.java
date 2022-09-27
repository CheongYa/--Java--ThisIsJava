//for 문(1)
package ch04.sec04;

public class PrintFrom1To10Example {
    public static void main(String[] args) {
        /*
        for(①초기화식; ②조건식; ④증감식) {
                    ③ 실행문       <--------반복 영역
         }
         */
        for(int i=1; i<=10; i++) {
            System.out.print(i + " ");
        }
    }
}
