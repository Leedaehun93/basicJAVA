package chap09.sec02.exam03;

/**
 * packageName : chap09.sec02.exam03
 * fileName : Anonymous
 * author : L.DH
 * date : 2023-10-02
 * description : 익명 객체 안에서의 지역 변수 사용시 주의점
 * 요약 :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class Anonymous {
    private int field; // 속성
    public void method(int arg) {
//      TODO : 지역변수/매개변수 -> 상수(final)로 바뀌기 때문에 수정이 불가하다.
        int var1 = 0;       // 지역변수 -> 상수(final) : 수정 불가
//        var1 = 1;         // 지역변수 -> 상수(final) : 수정 불가
//        arg = 2;          // 지역변수 -> 상수(final) : 수정 불가

// TODO : 익명 객체 생성
        Calculator calculator = new Calculator() {
            @Override
            public int sum() {
                int result = arg + var1;
                return result;
            }
        };
    }
}
