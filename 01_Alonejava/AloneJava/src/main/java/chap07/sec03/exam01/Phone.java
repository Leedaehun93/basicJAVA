package chap07.sec03.exam01;

/**
 * packageName : chap07
 * fileName : Phone
 * author : L.DH
 * date : 2023-09-22
 * description : 추상 클래스
 * 요약 : public abstract class 클래스명
 * 활용 : 자식 클래스를 만들어서 상속받아 사용해야함
 * 목적 : 프로젝트에서 개발자 많을 떄 함수이름과 속성이름을 통일시킬 목적으로 사용함
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public abstract class Phone {
    public String owner;

    //  매개 1개짜리 생성자 : alt + insert
    public Phone(String owner) {
        this.owner = owner;
    }

    // 전원 키는 함수
    public void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }

    // 전원 끄는 함수
    public void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }
}