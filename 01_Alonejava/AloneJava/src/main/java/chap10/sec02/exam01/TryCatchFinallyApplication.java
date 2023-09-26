package chap10.sec02.exam01;

/**
 * packageName : chap10.sec02.exam01
 * fileName : TryCatchFinallyApplication
 * author : L.DH
 * date : 2023-09-26
 * description : TODO : (***) 에러 처러 : try ~ catch 구문 이용
 * TODO : (참고) : 예외(개발자 에러) vs 시스템 에러(자바가상머신 에러)
 *  에러처리를 왜 하는가?
 * 에러(예외)가 발생하면 콘솔에 빨간줄의 에러코드가 나타남
 * => 사용자 입장에서 보기가 좋지 않음
 * => 목적 :에러처리를 이용해서 좀 더 품질 좋은 프로그램을 만들기 위함
 * (예) 에러발생 -> 관리자가 확인중입니다. 메세지 출력
 * <p>
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-26         L.DH         최초 생성
 */
public class TryCatchFinallyApplication {
    public static void main(String[] args) {
//        TODO : 에러 처러 : try ~ catch 구문 이용
//         사용법 : try { 실행문; } catch (에러클래스 변수) {에러처리실행문;}
//           => (설명) try 의 실행문이 실행될때 에러가 발생하면 catch 실행문이 실행됨
        try {
//          Class.forName(클래스명) : 클래스명에 해당되는 자바클래스를 리턴            
            Class clazz = Class.forName("String2"); //  TODO : 에러 발생
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");  // TODO : 에러 발생시 빨간줄이 생기지 않고 출력 내용이 나옴
        }
    } // end of main
} // end of class
