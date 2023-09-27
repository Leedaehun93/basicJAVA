package chap14.sec01.exam02;

import java.util.Optional;

/**
 * packageName : chap14.sec01.exam02
 * fileName : OptionalApplication
 * author : L.DH
 * date : 2023-09-27
 * description : Optional 클래스 ( null 방지 클래스 )
 * 요약 : null point 위해 사용하는 클래스
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-27         L.DH         최초 생성
 */
public class OptionalApplication {
    public static void main(String[] args) {
//      TODO : OPtion 객체
//       사용법 : Optional.of(값); : Optional 객체에 들어감
//        String str = "abcde"
        Optional<String> optional = Optional.of("abcde");

//      TODO : 가져오기(꺼내기) : 옵셔널객체변수.get()
//      결과 출력 : abcde
        System.out.println(optional.get());
//      TODO : 정수 넣기 <Java의 래퍼 클래스(wrapper class)를 사용>
        Optional<Integer> optional2 = Optional.of(0);
//      TODO : 빈것 넣기
        Optional<Object> optional3 = Optional.empty();

//      TODO : 현재 옵셔널 객체에 값이 있는지 확인 : isPresent() : true/false
//      결과 출력 : true    // 정수 0이 들어있음
        System.out.println(optional2.isPresent());
//      결과 출력 : false   // 비어있음
        System.out.println(optional3.isPresent());

//      TODO : 빈것 또는 null 일 경우 아래와 같이 코딩
//       사용법 : 옵셔널객체변수.orElse("대체문자열")
//      결과 출력 : 없음   // null -> 없음
        System.out.println(optional3.orElse("없음"));
    }
}
