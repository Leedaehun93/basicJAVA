package chap07.verify.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : ColorPoint
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class ColorPoint extends Point {
    String color; // 점의 색

    public void setColor(String color) {
        this.color = color;
    }

    void showColorPoint() {
        System.out.print(color); // 색깔 출력
        showPoint(); // 부모 클래스의 함수 호출 (3,4)
    }
}