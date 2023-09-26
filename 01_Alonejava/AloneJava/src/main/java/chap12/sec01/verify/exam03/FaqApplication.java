package chap12.sec01.verify.exam03;

import java.util.List;

/**
 * packageName : chap12.sec01.verify.exam03
 * fileName : FaqApplication
 * author : kangtaegyung
 * date : 2023/04/05
 * description :
 * TODO : MVC 디자인패턴
 *      M : 모델(Model)         - 속성, 생성자, getter/setter 함수 (정보 저장용 클래스)
 *          DAO(DB 접속용 클래스) - CRUD(C:Create(insert) 함수만 존재
 *                                     R: Read(select)
 *                                     U: Update
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05         kangtaegyung          최초 생성
 */
// TODO: 연습문제) 실행 클래스의 결과가 다음과 같도록
//       Faq 모델을 디자인하고 실행클래스 FaqApplication 에서
//      다음과 같은 결과가 나오도록 코딩하세요
//    결과 :
//        1 제목1 내용1
//        2 제목2 내용2
//        3 제목3 내용3
public class FaqApplication {
    public static void main(String[] args) {
        FaqDao faqDao = new FaqDao();

        List<Faq> faqList = faqDao.createFaq();

//      List 배열 내용 출력
        for (Faq faq : faqList) {
//          TODO: get속성명() : getter 함수 형태
            System.out.println(faq.getFid() + " "  // getFid() : getter 함수
                    + faq.getSubject() + " "
                    + faq.getText());
        }
    }
}
