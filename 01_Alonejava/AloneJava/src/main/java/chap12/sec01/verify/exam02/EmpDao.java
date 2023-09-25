package chap12.sec01.verify.exam02;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap12.sec01.verify.exam02
 * fileName : EmpDao
 * author : L.DH
 * date : 2023-09-25
 * description : 연습문제) ArrayList 활용 자료 추가하기
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class EmpDao {

    public List<Emp> createEmp() {
//  객체 생성 : 다형성 List
        List<Emp> list = new ArrayList<>();

// list 에 emp 객체를 저장
        list.add(new Emp(1, "Scott", 3000, 500, 10));
        list.add(new Emp(2, "Mark", 3500, 0, 20));
        list.add(new Emp(3, "Smith", 5000, 1000, 30));

        return list;
    }

}