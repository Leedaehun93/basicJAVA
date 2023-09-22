package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : AnimalApplication
 * author : L.DH
 * date : 2023-09-22
 * description : 실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class AnimalApplication {
    public static void main(String[] args) {
//      자식 객체
        Dog dog = new Dog();        // 멍멍
        Cat cat = new Cat();        // 야옹

        dog.sound();
        cat.sound();

        System.out.println("------------------------------");
        
//      TODO : 2)  사용목적 : 다형성 이용
//       사용법 : 부모 객체  = new 자식생성자()
        Animal animal = new Dog();
        animal.sound();             // 멍멍

        animal = new Cat();
        animal.sound();             // 야옹
    }
}
