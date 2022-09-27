//문자열 타입
package ch02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        //Java 13부터 사용 가능한 텍스트 블록 문법이다.
        String str1 = "" +
                "{\n" +                         //\n은 줄바꿈이다.
                "\t\"id\":\"winter\",\n" +      //\t는 탭만큼 띄우기, \"는 큰따옴표(") 출력이다.
                "\t\"name\":\"눈송이\"\n" +
                "}";

        String str2 = """
                {
                    "id":"winter",
                    "name":"눈송이"
                }
                """;

        System.out.println(str1);
        System.out.println("---------------------------------------------------");
        System.out.println(str2);
        System.out.println("---------------------------------------------------");
        //줄바꿈을 하고 싶지 않은데 편의상 줄을 바꿔서 코드를 짜야한다면 끝에 \를 붙여주면 된다. 이 기능은 Java 14부터 제공한다.
        String str = """
                나는 자바를 \
                학습합니다.
                나는 자바 고수가 될 겁니다.
                """;
        System.out.println(str);
    }
}
