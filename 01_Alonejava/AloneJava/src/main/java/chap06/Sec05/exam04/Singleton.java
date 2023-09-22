package chap06.Sec05.exam04;

/**
 * packageName : chap06.Sec05.exam04
 * fileName : Singleton
 * author : L.DH
 * date : 2023-09-21
 * description : 디자인 패턴(23)_생성(5)_싱글톤 패턴 1
 * 요약 : 목적 : 공유(정적, 전역) 객체 : 객체의 상태를 공유하기 위한 목적
 *       정적(공유) 속성 변수/함수
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Singleton {
//  TODO:  1) 클래스 내에서 없으면 1개만 생성되게 해야함
    private static Singleton singleton = new Singleton(); // 객체 1개 생성

//  TODO: 2) 일단 다른 객체에서 생성을 못하게 막아야함 : 공유(정적) 객체(오직 1개)
//          => 다른 객체에서 이 객체의 생성자함수 접근을 막아야함 : private 생성자
    private Singleton() {
    }

//  TODO: 3) 다른 객체에서 만들어진 객체를 사용하게 허가함 : 정적(공유)함수
    static Singleton getInstance() {
//      getInstance() 함수를 호출하면 공유속성 singleton 전달받음
        return singleton;
    }

}