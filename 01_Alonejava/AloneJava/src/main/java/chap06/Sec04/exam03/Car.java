package chap06.Sec04.exam03;

/**
 * packageName : chap06.Sec04.exam03
 * fileName : Car
 * author : L.DH
 * date : 2023-09-20
 * description : 자동차 모델 클래스 / .run() 실행
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-20         L.DH         최초 생성
 */

/**
 * // gas 체크해서 차가 출발을 합니다.
 * //    gas 있으면 "출발합니다" 출력하고,
 * //    .run() 실행 // gas--; 감소시킴 반복문 종료
 * //    다시 gas > 0 인지 확인해서 "gas를 주입할 필요가 없습니다"
 * //     아니면 "gas"를 주입하세요"
 * //    결과 :
 * //      gas가 있습니다.
 * //      출발합니다.
 * //      달립니다.(gas잔량:5)
 * //      달립니다.(gas잔량:4)
 * //      달립니다.(gas잔량:3)
 * //      달립니다.(gas잔량:2)
 * //      달립니다.(gas잔량:1)
 * //      멈춥니다.(gas잔량:0)
 * //      gas가 없습니다.
 * //      gas를 주입하세요.
 */
public class Car {
    //  TODO: 속성(필드), 생성자함수, 함수(메소드)
    int gas; // 기름

    //  속성에 값을 넣지 않고 1) 생성자를 이용해서 값을 넣거나
//                     2) setter 함수 이용해서 값을 수정하거나
//  사용법: void set속성명(int 속성명) { this.속성명 = 속성명;}
//  역할 : 속성에 값을 저장/수정하는 함수
//  자동화기능 : alt + insert => setter 선택
    void setGas(int gas) {
        this.gas = gas;
    }
    /**
     * gas 가 남았는지 확인하는 함수
     */
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas 가 없습니다. ");
            return false;
        } else {
            System.out.println("gas 가 있습니다.");
            return true;
        }
    }

    /**
     * 자동차를 달리게 하는 함수 : gas 가 1씩 감소함
     * 계속 달리다가 gas == 0 순간 중단
     */
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다.(gas잔량 : " + gas + ")");
                gas = gas - 1;
            } else {
                System.out.println("멈춥니다..(gas잔량 : " + gas + ")");
                return; // break 동일한 효과(강제 중단)
            };
        }
    };

}   // end of class

