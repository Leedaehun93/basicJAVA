package chap12.sec01.verify.exam01;

/**
 * packageName : chap12.sec01.verify.exam01
 * fileName : Dept
 * author : kangtaegyung
 * date : 2023/04/05
 * description :
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05         kangtaegyung          최초 생성
 */
public class Dept {
    private int dno;
    private String dname;
    private String loc;

//    생성자
    public Dept(int dno, String dname, String loc) {
        this.dno = dno;
        this.dname = dname;
        this.loc = loc;
    }

//    getter
    public int getDno() {
        return dno;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }
}
