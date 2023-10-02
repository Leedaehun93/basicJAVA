package chap09.sec02.exam02;

/**
 * packageName : chap09.sec02.exam02
 * fileName : Anonymous
 * author : L.DH
 * date : 2023-10-02
 * description : 인터페이스 부모 클래스 익명 클래스의 사용법 : 익명(이름이 없는)
 * 요약 :
 * 활용 1) 상속 관계
 * 활용 2) 특정 위치(코딩 라인)에서 1번만 사용 될 경우
 * TODO : 사용법 1 : 부모 클래스 객체 변수 = new 부모생성자함수(){
 *  //                               익명 클래스(자식)
 *  //                               속성
 *  //                               함수(고유, 재정의)
 *  //                               }
 *
 * TODO : 사용법 2 : 인터페이스 인터페이스변수 = new 인터페이스(){
 *  //                               익명 클래스(자식)
 *  //                               속성(공유상수)
 *  //                               함수(재정의)
 *  //                               }
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class Anonymous {
//    TODO: 1) 속성 : 익명 객체 사용
//     사용법: 인터페이스명 변수 = new 인터페이스명(){익명 클래스(자식)}
    RemoteControl field =
            new RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("Tv 를 켭니다.");
                }

                @Override
                public void turnOff() {
                    System.out.println("Tv 를 끕니다.");
                }
            };

//    TODO: 2) 함수의 지역 변수로 익명 객체 사용
        void method1() {
            RemoteControl localVar = new RemoteControl() {
                @Override
                public void turnOn() {
                    System.out.println("오디오를 켭니다.");
                }

                @Override
                public void turnOff() {
                    System.out.println("오디오를 끕니다.");
                }
            };
            localVar.turnOn();
            localVar.turnOff();
        }

//  TODO : 3) 매개변수의 다형성 이용으로 익명 객체(자식) 사용
    void method2 (RemoteControl remoteControl) {
            remoteControl.turnOn();
            remoteControl.turnOff();
    }
}