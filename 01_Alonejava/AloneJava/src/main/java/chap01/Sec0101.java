package chap01;

/**
 * packageName : chap01
 * fileName : Sec0101
 * author : GGG
 * date : 2023-09-18
 * description :    업무 로직 클래스
 * 요약 :
 *          환경 설정 : JavaApplication ( main 함수가 있는 클래스 : 실행 클래스 )
 *                     클래스 ( 객체 정의 ) : 변수 / 함수가 있는 파일(업무 로직이 들어 있는 클래스)
 *                     툴 : 1) 파일 인코딩 ( UTF-8 )
 *                          2) 도움말 ( Help ) - 사용자 지정 VM 옵션
 *                           - Dfile.encoding=UTF-8
 *                           - Dconsole.encoding=UTF-8
 *                          3) 설정 - 플러그인 - 마켓플레이스
 *                           1) Atom Material Icons
 *                           2) Korean Language Pack
 *                           3) Rainbow Brackets
 *                           4) Presentation ASSistant (생략 가능)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
public class Sec0101 {
    /**
     * Hello world 출력
     *
     */
    public void exam01() {
//      출력 단축키 : sout
        System.out.println( "Hello World" );
    }
    public void exam02() {
//       예제1) x, y 정수 변수를 만들어서 덧셈결과를 화면에 출력하세요.
//         입력 : x=1, y=2
        int x=1, y=2;
        int result = x + y;
        System.out.println( result );
    }
}
