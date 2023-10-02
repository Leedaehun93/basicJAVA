package chap09.sec01.exam04;

/**
 * packageName : chap09.sec01.exam04
 * fileName : Outer
 * author : L.DH
 * date : 2023-10-02
 * description : 로컬 클래스에서의(함수안의 클래스) 사용 제한
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class Outer {
    public void method2(int arg) {
// TODO : 지역변수 => 상수로 바뀜(final)
        int localVar = 1;
//        localVar = 2; // 불가(상수는 변경 못함)
//      TODO : 로컬 클래스
        class Inner {
            public void method() {
                int result = arg + localVar; // 가능
            }
        }
    }
}