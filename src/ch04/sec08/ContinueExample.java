//continue 문
package ch04.sec08;
public class ContinueExample {
    public static void main(String[] args) throws Exception {
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) {      //2로 나눈 나머지가 0이 아닐 경우, 즉 홀수인 경우
                continue;       //조건식으로 이동
            }
            System.out.println(i + " ");
        }
    }
}
