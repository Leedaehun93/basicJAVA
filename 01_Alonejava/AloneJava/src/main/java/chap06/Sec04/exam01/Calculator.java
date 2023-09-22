package chap06.Sec04.exam01;

/**
 * packageName : chap06.Sec04.exam01
 * fileName : Calculator
 * author : L.DH
 * date : 2023-09-20
 * description : 모델 클래스
 *               함수(멤버 메소드)
 * 요약 :
 *      MVC 디자인 패턴 : M(Model), V(View), C(Controller)
 *      함수 형태 : 접근제어자 리턴자료형 함수명(매개변수1, ... , 매개변수n){실행문;}
 *                 ex) public void sample(int a, String b, double c){}
 *                 접근제어자 : public(공용), default(생략, package 내에서는 사용가능) 등
 *                 함수이름 명명법 : 낙타표기법(카멜표기법), 첫글자는 소문자, 단어 + 단어는 대문자
 *                 매개변수 : 함수 실행 시 전달되는 데이터
 *                 리턴자료형 : 함수가 실행된 이후 결과값을 내보내기 할 떄 사용
 *                 리턴값이 없는 함수 형태 호출 : 객체변수.함수();
 *                 리턴값이 있는 함수 형태 호출 : ex) double result = 객체변수.함수();
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class Calculator {
//  TODO : 속성(필드), 생성자함수, 함수(메소드)
//  속성 생략 : 사물이나 사람의 특징을 나타냄
//  생성자 생략
//  TODO : 함수 : 사물이나 사람의 동작을(행동) 나타냄

    /**
     * 전원 켜는 함수 : 리턴값 없이 만듬 : void
     * 사용법 : 접근제어자 리턴자료형 함수명(매개변수1, ... 매개변수n){}
     * 접근제어자 : public(공용,*), private(개인,*), default(생략), protected
     */
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    /**
     * 더하기 함수 : 리턴값이 있는 함수
     */
    int plus(int x, int y) {
        int result = x + y;

        return result;  // TODO : 결과 내보내기의 자료형(정수:int)
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;

        return result;  // TODO : 결과 내보내기의 자료형(정수:int)
    }

}   // end of class