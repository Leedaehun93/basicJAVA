package chap07.verify.exam09;

/**
 * packageName : chap07.verify.exam09
 * fileName : Printer
 * author : kangtaegyung
 * date : 2023/03/30
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30         kangtaegyung          최초 생성
 */
public class Printer {
    public void powerOn(){
        System.out.println("전원켜기");
    }

    public void print() {
        System.out.println("기본 프린터 입니다. 기본사양으로 프린팅합니다.");
    };

    public void powerOff(){
        System.out.println("전원끄기");
    }
}
