package chap12.sec01.verify.exam01;
import java.util.List;

/**
 * packageName : chap12.sec01.verify.exam01
 * fileName : DeptApplication
 * author : kangtaegyung
 * date : 2023/04/05
 * description : 실행클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05         kangtaegyung          최초 생성
 */
// TODO: 연습문제) 실행 클래스의 결과가 다음과 같도록 DeptDao 의 createDept() 함수에
//         List 의 자료를 추가하는 로직을 작성하세요.
//    결과 :
//      10 Sales       부산
//      20 Marketing   서울
//      30 Research    대전
public class DeptApplication {
    public static void main(String[] args) {
        DeptDao deptDao = new DeptDao();
        List<Dept> deptList = deptDao.createDept(); // 자료 생성

//  TODO : 결과 출력 : 반복문(향상된 for 문) 이용
        for(Dept dept : deptList) {
            System.out.println(dept.getDno() + " " + dept.getDname()
                    + " " + dept.getLoc());
        }
    }
}
