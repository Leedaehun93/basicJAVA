package chap09.sec01.exam01;

/**
 * packageName : chap09.sec01.exam01
 * fileName : OuterApplication
 * author : GGG
 * date : 2023-10-02
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class OuterApplication {
    public static void main(String[] args) {
//      TODO: 외부 클래스 : Outer 객체 생성
        Outer outer = new Outer();

//      TODO: 1) 일반 속성 내부 클래스 객체 생성
//        사용법 : 외부클래스.내부클래스 객체변수 = 외부객체.new 내부생성자함수();
        Outer.Attr attr = outer.new Attr();
        attr.field1 = 3; // 내부 클래스의 속성
        attr.method1();  // 내부 클래스의 함수

//      TODO: 2) 정적(공유) 속성 내부 클래스 객체 생성 없음 : 바로 호출
//        사용법 : 외부클래스.내부클래스.속성,  외부클래스.내부클래스.함수()
        Outer.Share.field2 = 3; // 공유 내부 클래스의 공유 속성 호출
        Outer.Share.method2();  // 공유 내부 클래스의 공유 함수 호출

//      TODO: 3) 로컬 클래스 : 함수 안의 클래스
        outer.method(); // 안에서 클래스 자동 생성됨

    }
}