//키보드 입력 데이터를 변수에 저장
package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //scanner 변수 선언 <- Scanner 객체 생서

        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        //scanner.nextLine(): 키보드로 입력된 내용을 문자열로 읽고 좌측 String 변수에 저장
        int x = Integer.parseInt(strX);
        
        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);
        
        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();
        
        while(true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")) {
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }
        System.out.println("종료");
    }
}