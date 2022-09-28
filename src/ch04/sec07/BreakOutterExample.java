//break문
package ch04.sec07;
public class BreakOutterExample {
    public static void main(String[] args) throws Exception {
        Outter: for(char upper='A'; upper<='Z'; upper++) {      //Outter라는 라벨 생성
            for(char lower='a'; lower<='z';lower++) {
                System.out.println(upper + "-" + lower);
                if(lower=='g') {
                    break Outter;       //Outter 종료
                }
            }
        }
        System.out.println("프로그램 실행 종료");
    }
}
