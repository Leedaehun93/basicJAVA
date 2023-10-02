package chap09.sec02.exam01;

/**
 * packageName : chap09.sec02.exam01
 * fileName : Anonymous
 * author : L.DH
 * date : 2023-10-02
 * description : 부모 클래스 익명 클래스의 사용법 : 익명(이름이 없는)
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
 * ———————————————————————————————————————————————————————————
 * 2023-10-02         L.DH         최초 생성
 */
public class Anonymous {
    // TODO : 1) 일반 속성에 익명 객체 생성
    Person field = new Person() {
        // TODO : 익명 클래스(자식)
        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work(); // 고유함수 호출
        }
    };

    // TODO : 2) 함수의 지역 변수로 익명객체 생성
    void method1() {
        Person localVar = new Person() {
            // TODO : 익명 클래스(자식)
            void walk() {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("6시에 일어납니다.");
                walk(); // 고유함수 호출
            }
        };
        localVar.wake(); // 변수 안에 익명객체 함수 호출
    }

    // TODO : 3) 함수의 매개변수로 익명객체 전달 : 매개변수의 다형성
    void method2(Person person) {
        person.wake();
    }
}
