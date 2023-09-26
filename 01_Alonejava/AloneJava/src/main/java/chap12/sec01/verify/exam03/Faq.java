package chap12.sec01.verify.exam03;

/**
 * packageName : chap12.sec01.verify.exam03
 * fileName : Faq
 * author : L.DH
 * date : 2023-09-26
 * description : 연습문제)모델 클라쓰
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class Faq {
//  TODO : 속성
    private int Fid;
    private String Subject;
    private String Text;

//  TODO : 기본 생성자, 풀 속성 생성자
    public Faq(){
    }
    public Faq(int fid, String subject, String text) {
        Fid = fid;
        Subject = subject;
        Text = text;
    }
//  TODO : getter 함수
    public int getFid() {
        return Fid;
    }

    public String getSubject() {
        return Subject;
    }

    public String getText() {
        return Text;
    }
}
