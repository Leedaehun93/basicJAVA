package chap02;

/**
 * packageName : chap02
 * fileName : Sec0202
 * author : GGG
 * date : 2023-09-18
 * description : 기본 자료형(Type)
 * 요약 :
 *       정수 : byte(1), short(2), int(4), long(8)
 *       char : 2byte 자료형 문자 1개를 의미, 홑따옴표('') 표시
 *       (저장시 유니코드(숫자)로 저장되고 출력 시는 문자로 출력됨)
 *       string(***) : 쌍따옴표("") 로 감싼 문자열을 의미
 *       실수 : float(4), double(8, ***)
 *       boolean : 참/거짓 자료형, true/false
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Sec0202 {
    public void exam01() {
//          1bit : 최소 단위, 8bit : 1byte, 1024byte = 1KB
//          1024KB = 1MB, 1024MB = 1GB, 1024GB = 1TB, 1024TB = 1HB
//          2진수 표현 : 0b 붙이면 2진수(0, 1 로 표현하는 수)
        int var1 = 0b1011;  // 2진수(0b 붙이면)
        int var2 = 0206;    // 8진수(0 붙이면 8진수)
        int var3 = 365;     // 10진수
        int var4 = 0xB3;    // 16진수(0x 붙이면 16진수)
//  결과 : sout, 줄복사 : ctrl + d
        System.out.println("var1 : " + var1);   // 11
        System.out.println("var2 : " + var2);   // 134
        System.out.println("var3 : " + var3);   // 365
        System.out.println("var4 : " + var4);   // 179
    }

    public void exam02() {
        long var1 = 10;      // 정수 8byte
        long var2 = 20L;     // L 붙여면 long 자료형
//      결과 출력
        System.out.println(var1);   // 10
        System.out.println(var2);   // 20
    }

    public void exam03() {
//        아스키 코드
        char c1 = 'A';
        char c2 = 65;
//      결과 출력
        System.out.println(c1); // 문자를 직접 저장
        System.out.println(c2); // 십진수 저장 => 'A'
    }

    public void exam04() {
        String name = "홍길동";
        String job = "프로그래머";
//      결과 출력
        System.out.println(name);   // 홍길동
        System.out.println(job);   // 프로그래머
    }

    /**
     * 특수기호 : /n, /t, ", \(이스케이프문자)
     */
    public void exam05() {
        System.out.println("번호\t이름\t직업");   // 탭문자 // 번호	이름	직업
        System.out.println("행 단위 출력\n");   // 줄바꿈 문자    // 행 단위 출력(다음 행 띄움)
        System.out.println("우리는\"개발자\" 입니다.");   // \" 사용 // 우리는"개발자" 입니다.
        System.out.println("봄\\여름\\가을\\겨울");   // \\ 사용 // 봄\여름\가을\겨울
        /**
         * 실수 : float(4),  double(8, ***)
         */
        float var2 = 3.14f; // float 사용시 끝에 f 붙임
        double var3 = 3.14; // double
//      결과 출력
        System.out.println(var2);   // 3.14
        System.out.println(var3);   // 3.14
        /**
         * e : 지수 표현식
         */
        double var6 = 3e6;
        double var7 = 2e-3;
//      결과 출력
        System.out.println(var6);   // 3000000.0
        System.out.println(var7);   // 0.002
    }
}