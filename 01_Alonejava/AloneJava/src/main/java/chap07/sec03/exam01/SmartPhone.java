package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : SmartPhone
 * author : L.DH
 * date : 2023-09-22
 * description : 
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class SmartPhone extends Phone{
    //    생성자 : alt + insert
    public SmartPhone(String owner) {
        super(owner);
    }
    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}