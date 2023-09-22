package chap07.verify.exam11;

/**
 * packageName : chap07.verify.exam05
 * fileName : OverridingApplication
 * author : ds
 * date : 2022-09-30
 * description : 연습문제)다형성 리턴 값이 있는 함수 만들기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// 문제 : 다형성을 이용한 예제, 아래 클래스를 보고 Weapon(부모클래스) 클래스와
//      Cannon(자식클래스) 클래스를 완성하세요.
// 결과 :
//    기본 무기의 살상 능력은 1
//    대포의 살상 능력은 10
public class OverridingApplication {
    public static void main(String[] args) {
//      TODO :  weapon.fire() : 리턴 값이 있는 함수
        Weapon weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());

        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }

}