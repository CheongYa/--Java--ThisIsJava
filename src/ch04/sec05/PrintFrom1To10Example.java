//while 문(1)
package ch04.sec05;

public class PrintFrom1To10Example {
    public static void main(String[] args) {
        int i = 1;
        /*
        while( ①조건식 ) {
                ②실행문;       <--- 반복 영역
        }
         */
        while(i<=10) {      //변수가 10보다 작거나 같을 경우에 실행한다.
            System.out.print(i + " ");
            i++;            //i에 1이 더해진다.
        }
    }
}
