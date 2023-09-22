package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : ChildApplication
 * author : L.DH
 * date : 2023-09-22
 * description : 실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-22         L.DH         최초 생성
 */
public class ChildApplication {
    public static void main(String[] args) {
//  다형성 이용 객체 생성
//  TODO : 부모 객체 = 자식 객체
//         부모클래스 객체변수 = new 자식생성자();
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
//  TODO : 자식의(child) 고유함수 사용못함
//      parent.method3(); // x

//  예제 1) 위에서 다형성을 이용했는데 부득이하게 지식함수와 속성을 사용할 일이 생겼음
//  TODO : 강제형변환해서 자식 객체로 원복
    Child child = (Child) parent;   // TODO : (작은것(자식) -> 큰것(부모) : 자동), (큰것(부모) -> 작은것(자식) : 수동)
    child.field2 = "data2";         // 고유 속성 사용
    child.method3();                // 고유 함수 실행
    }
}
