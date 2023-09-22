package chap07.verify.exam05;

/**
 * packageName : chap07.verify.exam05
 * fileName : Penguin
 * author : L.DH
 * date : 2023-09-21
 * description : 연습문제)모델 클래스 객체 디자인(코딩)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class Penguin {
//  속성
    String name;
    String habitat;

//  객체 생성
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

//  함수(메소드)
    public void showInfo() {
        System.out.println(name + " 온 " + habitat + " 살아요!!!!");
    }
}
