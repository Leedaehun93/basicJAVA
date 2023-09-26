package chap11.sec01.exam03;

/**
 * packageName : chap11.sec01.exam03
 * fileName : SmartPhone
 * author : L.DH
 * date : 2023-09-26
 * description : toString() 함수 재정의
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class SmartPhone {
//  TODO : 속성
    private String company; // 제조사
    private String os;      // ( 안드로이드, ios )
//  TODO : 생성자
    public SmartPhone() {
    }
    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }
//  TODO : toString() 재정의 : 객체의 속성을 화면에 출력할 수 있음 : alt + insert
    @Override
    public String toString() {
        return "SmartPhone{" +
                "company ='" + company + '\'' +
                ", os ='" + os + '\'' +
                '}';
    }
} // end of class