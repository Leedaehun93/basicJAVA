package chap07.verify.exam03;

/**
 * packageName : chap07.verify.exam03
 * fileName : Point
 * author : L.DH
 * date : 2023-09-21
 * description : 연습문제) 모델 클래스 객체 코딩하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Point {
//  속성
    int x;
    int y;

//  객체 생성
//  기본생성자
    public Point() {
    }

//  객체 생성2
//  매개변수 2개짜리 생성자 객체 생성
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
//  객체의 함수 호출
    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}
