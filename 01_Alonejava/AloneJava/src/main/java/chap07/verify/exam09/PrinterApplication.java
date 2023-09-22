package chap07.verify.exam09;

/**
 * packageName : chap07.verify.exam09
 * fileName : PrinterApplication
 * author : kangtaegyung
 * date : 2023/03/30
 * description : 연습문제) 다형성
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30         kangtaegyung          최초 생성
 */
// 문제 : 아래문제는 속성의 다형성을 이용해서 실행시점에 동적으로 결과를 변경하고 있다.
//    부모인 Printer 객체를 확인하고,
//    LaserPrinter 와 ColorPrint 객체를 디자인(코딩) 하세요
//  결과 :
//    전원켜기
//    기본 프린터 입니다. 기본사양으로 프린팅합니다.
//    레이저프린터로 업그레이드 했습니다.
//    컬러프린터로 업그레이드 했습니다.
//    전원끄기
public class PrinterApplication {
    public static void main(String[] args) {
        //      부모 객체 생성
        Printer printer = new Printer();
        printer.powerOn(); //   "전원켜기"
        printer.print();     // "기본 프린터 입니다. 기본사양으로 프린팅합니다."

        //  속성의 다형성 이용 : 레이저 프린터로 변경
        printer = new LaserPrinter();
        printer.print();    // "레이저프린터로 업그레이드 했습니다."

//        속성의 다형성 이용 : 컬러 프린터로 변경
        printer = new ColorPrinter();
        printer.print();      // "컬러프린터로 업그레이드 했습니다."
        printer.powerOff();  // "전원끄기
    }
}