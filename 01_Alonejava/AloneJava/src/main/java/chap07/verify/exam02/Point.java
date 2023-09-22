package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : Point
 * author : L.DH
 * date : 2023-09-21
 * description : 부모 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Point {
    //  속성
    int x;  // 3
    int y;  // 4

    //  함수 : set(3, 4), showPoint()
    void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void showPoint(){
//  red(3, 4)
        System.out.println("(" + x +", " + y +")");
    }

}
