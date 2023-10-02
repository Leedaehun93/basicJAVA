package chap09.sec02.exam02;

/**
 * packageName : chap09.sec02.exam02
 * fileName : AnonymousApplication
 * author : L.DH
 * date : 2023-10-02
 * description : 부모 인터페이스를 이용한 익명 클래스 실행
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class AnonymousApplication {
    public static void main(String[] args) {
//  객체 생성
        Anonymous anonymous = new Anonymous();
//  TODO : 1) 익명객체(field) 속성의 함수 호출
//   실행(결과 출력) : // Tv 를 켭니다. // Tv 를 끕니다.
        anonymous.field.turnOn();
        anonymous.field.turnOff();

//  TODO : 2) 함수의 지역 변수로 익명 객체 사용
//   실행(결과 출력) : // 오디오를 켭니다. // 오디오를 끕니다.
        anonymous.method1();

//  TODO : 3) 매개변수의 다형성 이용으로 익명 객체(자식) 사용
//   실행(결과 출력) : // SmartTv 를 켭니다. // SmartTv 를 끕니다.
        anonymous.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTv 를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTv 를 끕니다.");
            }
        });
    }

}