//실수 타입
package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        //정밀도 확인
        //실수 리터럴을 기본적으로 double 타입으로 해석하기 때문에 double 타입 변수에 대입해야 한다.
        //float 타입에 대입하고 싶다면 리터럴 뒤에 소문자 'f'나 대문자 'F'를 부여 컴파일러에게 float 타입임을 알 수 있도록 해야한다.
        float var1 = 0.123456789123456789f;
        double var2 = 0.123456789123456789;
        //double 타입은 float 타입 보다 약 2배의 유효 자릿수를 가지고 있어 정확한 데이터 저장이 가능
        System.out.println(var1);
        System.out.println(var2);

        //10의 거듭제곱 리터럴
        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4);
        System.out.println("var5: " + var5);
    }
}
