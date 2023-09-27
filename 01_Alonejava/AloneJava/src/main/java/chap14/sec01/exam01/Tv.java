package chap14.sec01.exam01;

import java.util.Objects;

/**
 * packageName : chap14.sec01.exam01
 * fileName : Tv
 * author : kangtaegyung
 * date : 2023/04/05
 * description : 자식 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05         kangtaegyung          최초 생성
 */
class Tv extends Product {
    String name = "동성 Tv";

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return Objects.equals(name, tv.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "name='" + name + '\'' +
                '}';
    }
}
