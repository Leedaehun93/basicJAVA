package chap06.Sec03.exam03;

/**
 * packageName : chap06.Sec03.exam03
 * fileName : Car
 * author : L.DH
 * date : 2023-09-20
 * description :    자동차 클래스(생성자 함수)
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */
public class Car {
//  TODO : 속성(필드), 생성자함수, 함수(메소드)
//  속성
    String company = "현대자동차";    // 제조사
    String model;                   // 자동차 모델(SUV, 세단)
    String color;                   // 자동차 색깔
    int maxSpeed;                   // 최고속도

//  기본 생성자
    public Car() {}

//  매개변수 1개짜리 생성자
    public Car(String model){
//    TODO : this (객체 자기자신(현재 위치에 클래스)을 의미하는 객체변수)
//          객체의 사용 : 객체변수.속성명
        this.model = model;
    }

//  매개변수 2개짜리 생성자
    public Car(String model, String color){
//    TODO : this (객체 자기자신(현재 위치에 클래스)을 의미하는 객체변수)
//          객체의 사용 : 객체변수.속성명
        this.model = model;
        this.color = color;
    }
//  매개변수 3개짜리 생성자
//  TODO : 자동화 기능 이용 : alt + insert => 생성자 속성 선택 후 확인
//  사용법 : 마우스 우 클릭 생성 클릭(단축키 : alt + insert)
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
} // end of class
