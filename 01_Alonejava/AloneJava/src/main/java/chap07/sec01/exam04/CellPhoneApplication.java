package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam04
 * fileName : CellPhoneApplication
 * author : L.DH
 * date : 2023-09-21
 * description : 실행 클래스
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-21         L.DH         최초 생성
 */
public class CellPhoneApplication {
    public static void main(String[] args) {
//      객체 생성 : Dmb 폰 생성
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바", "검정", 10);
        System.out.println("모델 : " + dmbCellPhone.model);        // 부모속성
        System.out.println("컬러 : " + dmbCellPhone.color);        // 부모속성
        System.out.println("채널 : " + dmbCellPhone.channel);      // 자식속성

//      전화 걸기
        dmbCellPhone.turnOnDmb();                                 // 전원켜기
        dmbCellPhone.bell();                                      // 통화음
        dmbCellPhone.sendVoice("여보세요");
        dmbCellPhone.receiveVoice("안녕하세요~ 반갑습니다.");
        dmbCellPhone.hangUp();                                    // 전화 끊기

//      tv 수신 : 자식 기능
        dmbCellPhone.turnOnDmb();                                 // tv 켜기
        dmbCellPhone.changeChannelDmb(12);                        // 채널 돌리기
        dmbCellPhone.turnOffDmb();                                // tv 끄기


    }
}