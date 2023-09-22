package chap06.Sec03.exam02;

/**
* packageName : chap06.Sec03.exam02
* fileName : Korean
* author : L.DH
* date : 2023-09-20
* description :    한국인 클래스(생성자 함수)
* 요약 :
*
* ===========================================================
* DATE            AUTHOR             NOTE
* ———————————————————————————————————————————————————————————
* 2023-09-20         L.DH         최초 생성
*/

public class Korean {
//  TODO : 속성, 생성자함수, 함수(메소드)
//  속성
    String name;    // 이름
    String ssn;     // 주민번호

//   생성자함수
//  기본 생성자 : 만들지 않아도 컴파일러가 자동으로 1개 생성함(생략 가능)
    Korean(){};  // 기본생성자

    Korean(String strName, String strSsn){
//  생성자의 역할 : 속성에 값을 처음에 넣어 두는 행위
        name = strName; // 매개변수 이름 값을 속성에 저장
        ssn = strSsn;  // 매개변수 주민번호 값을 속성에 저장
    }

}   // end of class
