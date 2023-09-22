package chap07.sec02.exam01;

/**
 * packageName : chap07.sec02.exam01
 * fileName : ChildApplication
 * author : L.DH
 * date : 2023-09-22
 * description : 실행 클래스 / 다형성 예제(필드의 다형성)
 * 요약 : 다형성 코드 : 부모 = 자식 (다형성 코드), 상속 관계에서만 가능
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class ChildApplication {
    public static void main(String[] args) {
//   다형성 코드 : 1)
//   TODO : 단형성 코드 : 좌변 우변 동일
        Child3 child3 = new Child3();   // child3 = 자식3 객체가 생성됨
        child3.method2();
        child3.method3();

//   다형성 코드 : 2) OK
//   TODO : 부모 = 자식 (다형성 코드), 상속 관계에서만 가능
//          목적(장점) : 실행시에 사용방법은 동일하지만 다양한 객체를 이용해서
//                      다양한 실행결과를 나오도록 코딩하고 싶을 때 사용함
//          기존 소스(As-Is 소스, 레가시 소스), 새로운 소스를 만들어서 계속 바꿔 끼움
//          부모 자료형 = 자식 자료형 : 자동 형변환(큰것 <- 작은것)
        Parent parent2 = new Child3(); // 부모 parent2 = 자식3
        parent2.method1();
        parent2.method2(); // 부모 함수 (x) / 자식 함수 (o) : 함수 재정의
//      TODO : 주의점 : 다형성을 이용해서 만든 객체(parent2) 에서 자식 고유의 함수를 사용하지 못함
//             parent2.method3(); // 안됨(부모 쪽에 method3 함수가 없기 때문에 불러올 수가 없음)
    }

}
