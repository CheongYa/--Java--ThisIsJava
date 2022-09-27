//강제 타입 변환
package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        //int(4byte) -> byte(1byte)
        //2byte 이상이 필요한 int 값은 원래 값이 보존되지 않으니 주의해야 한다.
        //-128 ~ 127인 int 값만 원래 값을 보존할 수 있다.
        int var1 = 10;
        byte var2 = (byte) var1;
        System.out.println(var2);

        //long(8byte) -> int(4byte)
        long var3 = 300;
        int var4 = (int) var3;
        System.out.println(var4);

        //int(4byte) -> char(2byte)
        //char 타입의 허용 범위인 0~65535 사이의 값만 원래 값을 유지한다.
        int var5 = 65;
        char var6 = (char) var5;
        System.out.println(var6);

        //실수(float = 4byte, double = 8byte) -> 정수(byte, short = 2byte, int, long)
        //소수점 이하 부분은 버려지고, 정수 부분만 저장된다.
        double var7 = 3.14;
        int var8 = (int) var7;
        System.out.println(var8);
    }
}
