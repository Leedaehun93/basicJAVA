package chap08.exam01;

/**
 * packageName : chap08.exam01
 * fileName : RemoteControl
 * author : L.DH
 * date : 2023-09-22
 * description : 인터페이스
 * 요약 : 인터페이스(추상클래스 : 부모클래스) : 추상클래스와 비슷,
 * 내부에 정의되는 함수는 모두 추상함수됨
 * 내부에 정의되는 속성은 모두 정적(공유)상수됨(static final)
 * 정의 사용법 : public interface 인터페이스명 {}
 * 상속 사용법 : public class 자식클래스명 implements 부모인터페이스1, ..., 부모인터페이스n {}
 * => 함수 재정의가 필요함
 * 목적 : 1) 프로젝트에서 이름(함수/속성) 표준화를 위해 사용, 2) 다형성 이용
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public interface RemoteControl {
    //  TODO : 속성 == 정적(공유) 상수(명명법 : 모두 대문자)
    int MAX_VOLUMN = 10;
    int NIM_VOLUMN = 1;

    //  TODO : 함수 == 추상함수 (실행블럭{} 없음)
    void turnOn();  // 리모콘 켜기 함수

    void turnOff();  // 리모콘 끄기 함수
}
