package chap12.sec01.verify.exam02;

import java.util.List;

/**
 * packageName : chap12.sec01.verify.exam02
 * fileName : EmpApplication
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
// TODO: 연습문제) 실행 클래스의 결과가 다음과 같도록
//       Emp 모델을 디자인하고 EmpDao의 createEmp()
//       List 의 자료를 추가하는 로직을 작성하세요.
//    결과 :
//        1 Scott 3000 500 10
//        2 Mark 3500 0 20
//        3 Smith 5000 1000 30
public class EmpApplication {
    public static void main(String[] args) {
        EmpDao empDao = new EmpDao();

        List<Emp> empList =  empDao.createEmp();

        //        List 배열 내용 출력
        for(Emp emp : empList) {
            System.out.println(emp.getEno() + " "
                          + emp.getEname() + " "
                          + emp.getSalary() + " "
                          + emp.getComission() + " "
                          + emp.getDno());
        }
    }
}
