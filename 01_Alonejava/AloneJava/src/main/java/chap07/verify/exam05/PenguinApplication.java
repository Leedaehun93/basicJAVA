package chap07.verify.exam05;

/**
 * packageName : chap07.verify.exam0103
 * fileName : PororoApplication
 * author : kangtaegyung
 * date : 2023/03/30
 * description : 실행 클래스(main)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30         kangtaegyung          최초 생성
 */
// 문제 : 아래 실행 클래스를 보고 Penguin 객체를 코딩하세요
// 결과 :
//    뽀로로
//    남극
//    뽀로로 은 남극 살아요!!!!
public class PenguinApplication {
    public static void main(String[] args) {
        Penguin pororo = new Penguin();

        pororo.setName("뽀로로");    // Setter
        pororo.setHabitat("남극");  // Setter

        System.out.println(pororo.getName());      // Getter
        System.out.println(pororo.getHabitat());   // Getter

        pororo.showInfo();  // 결과 : 뽀로로 은 남극 살아요!!!!
    }
}
