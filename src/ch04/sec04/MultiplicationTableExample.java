//for 문(4)
package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for(int m=2; m<=9; m++) {       //중첩 for문 사용
            System.out.println("*** " + m + "단 ***");
            for(int n=1; n<=9; n++) {
                System.out.println(m + " x " + n + " = " + (m*n));
            }
        }
    }
}
