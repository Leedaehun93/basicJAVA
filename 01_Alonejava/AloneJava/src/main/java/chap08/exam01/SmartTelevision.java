package chap08.exam01;

/**
 * packageName : chap08.exam01
 * fileName : SmartTelevision
 * author : L.DH
 * date : 2023-09-22
 * description : 자식클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class SmartTelevision implements RemoteControl, Searchable {
//  alt + insert : 메서드 구현(선택)

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void search(String url) {
        System.out.println(url + " 를 검색합니다.");
    }
}