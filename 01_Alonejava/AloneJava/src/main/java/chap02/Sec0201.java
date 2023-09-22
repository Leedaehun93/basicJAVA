package chap02;

/**
 * packageName : chap02
 * fileName : Sec0201
 * author : GGG
 * date : 2023-09-18
 * description :
 *               변수          : 값을 저장할 수 있는 메모리 공간
 *               변수 사용 범위 : {} 안에서만 사용 가능
 *                  만약에 {} 안에 {} 있다면 변수는 안에 {} 도 사용 가능함
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-09-18         GGG          최초 생성
 */
    public class Sec0201 {
    public void exam01() {
//        변수 선언
        int value = 20;

//        변수 연산
//        예제2) 변수 value 에 값을 10 더하는 연산을 한 후 화면에 출력하세요
        int result = value + 10;
//        결과 출력 : sout
        System.out.println( result );
    }
    public void exam02() {
//        예제3) x=3, y= 5 가 있습니다.  x와 y 값을 바꾸어서 출력하세요.
//        결과 출력은 아래와 같이 출력하세요.
//        결과 : x = 5 , y = 3
//        변수의 값을 바꾸기 : swap 코딩 (임시 변수 1개 필요함)
        int x = 3;
        int y = 5;

//        swap 코딩
        int temp =  x; // x의 값을 임시변수에 넣어둠
        x = y;     // x의 값이 overwrite 됨
        y = temp;  // 임시변수 값을 y에 넣음
//        결과 출력 : sout
        System.out.println( "x:" + x + ", y:" + y );
    }

    /**
     * 변수의 허용 범위 예제
     */
    public void exam04() {
        int v1 = 15;
        if( v1 > 10 ) {
            int v2;
            v2 = v1 - 10;
        }
//        int v3 = v1 + v2 + 5; // v2 변수 사용불가라서 에러가 발생함
    }

}
