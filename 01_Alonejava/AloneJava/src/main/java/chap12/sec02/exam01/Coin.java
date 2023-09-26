package chap12.sec02.exam01;

/**
 * packageName : chap12.sec02.exam01
 * fileName : Coin
 * author : L.DH
 * date : 2023-09-26
 * description : 모델 코인 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class Coin {
    private int value;
// TODO : 기본 생성자/풀 속성 생성자, setter/getter 함수
//  TODO : 생성자(기본, 풀)
    public Coin() {
    }
    public Coin(int value) {
        this.value = value;
    }
// TODO : setter/getter 함수
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
} // end of class
