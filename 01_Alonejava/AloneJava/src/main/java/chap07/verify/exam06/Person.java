package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : Person
 * author : kangtaegyung
 * date : 2023/03/30
 * description : 부모 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/30         kangtaegyung          최초 생성
 */
public class Person {
    String name;

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
