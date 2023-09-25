package chap12.sec01.exam07;

import java.util.Hashtable;
import java.util.Map;

/**
 * packageName : chap12.sec01.exam07
 * fileName : HashTableApplication
 * author : L.DH
 * date : 2023-09-25
 * description : Map 부모 인터페이스의 자식클래스 HashTable
 * 요약 :
 * 활용 : 멀티쓰레드 환경에서 사용(병렬처리, 동기화문제)
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * ———————————————————————————————————————————————————————————
 * 2023-09-25         L.DH         최초 생성
 */
public class HashTableApplication {
    public static void main(String[] args) {
//  객체 생성 : 다형성 (키, 값)
        Map<String, String> map = new Hashtable<>();

//  Map의 함수 : 변수.put(키,값), 변수.get(키), 변수.remove(키)
        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");
//  결과 출력
        System.out.println(map);
    }

}