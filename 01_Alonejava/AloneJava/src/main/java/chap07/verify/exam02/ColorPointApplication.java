package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : ColorPointApplication
 * author : ds
 * date : 2022-09-30
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// 문제 : 아래 ColorPoint와 실행클래스를 보고
//     부모 클래스 Point를 완성하세요
// 결과 :
//    red(3,4)
public class ColorPointApplication {
    public static void main(String[] args) {
        ColorPoint colorPoint = new ColorPoint();

        colorPoint.set(3,4); // 부모 클래스의 함수 호출
        colorPoint.setColor("red"); // 자식 클래스의 함수 호출 red
        colorPoint.showColorPoint(); // 자식클래스의 함수 호출 (3,4)
    }
}