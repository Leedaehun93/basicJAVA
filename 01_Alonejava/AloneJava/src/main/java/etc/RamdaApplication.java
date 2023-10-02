package etc;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * packageName : etc
 * fileName : RamdaApplication
 * author : GGG
 * date : 2023-10-02
 * description :  람다식(js:화살표 함수) : 1) 함수형 인터페이스로 사용
 *                                      2) 익명객체에서 사용
 * 요약 :
 * <p>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2023-10-02         GGG          최초 생성
 */
public class RamdaApplication {

    /**
     * 1~100까지 중 10개의 랜덤 숫자 배열에 넣기 함수
     *  제네릭 함수 : 제네릭을 매개변수에 사용하는 함수, 반환타입 앞에 <T>를 붙임
     *             T 클래스 : 대표 T : 임의의 어떤 클래스를 대표하는 클래스로 사용
     *  제네릭 함수 : static <T> 반환타입 함수명(매개변수타입 매개변수명...) {}
     * @param s
     * @param list
     * @param <T>
     */
    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get()); // s.get() : 매개변수로 전달되는 생산자 함수를 대리하는 함수
        }
    }

    /**
     * List에 저장된 요소의 값이(i) 짝수인것만 화면에 출력
     * @param p
     * @param c
     * @param list
     * @param <T>
     */
    static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        for (T i: list) {
//            명제 : 참/거짓이 있는 문장
            if(p.test(i)) { //  p.test(값)   : 매개변수로 전달되는 논리(명제) 함수를 대리하는 함수
                c.accept(i); // c.accept(값) : 매개변수로 전달되는 소비자 함수를 대리하는 함수
            }
        }
        System.out.println(); // 줄바꿈
    }

    /**
     * 1의 자리를 없앤 새로운 배열을 만들어서 List에 저장하는 함수(1의 자리는 0으로 변경)
     * 제네릭 함수 : 함수의 리턴값 앞에 <T>, 제네릭표현식을 사용하는 함수
     * @param f
     * @param list
     * @return
     * @param <T>
     */
    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for (T i: list) {
            newList.add(f.apply(i)); //  p.apply(값)   : 매개변수로 전달되는 일반 함수를 대리하는 함수
        }
        return newList;
    }

    public static void main(String[] args) {
//        TODO: 여기 부터 코딩
//         js : 함수의 매개변수로 함수를 넣을 수 있음, 리턴값도 함수 내보내기 가능
//         java : 함수의 매개변수/리턴값으로 함수 사용 금지(기본)
//            => 부가기능 추가 : 5가지 경우의 대표 함수를(형태) 만들어서 사용
//            Runnable(실행) 함수 : 매개변수(x), 리턴값(x) 함수 예) void run()
//            Supplier(공급자) 함수 : 매개변수(x), 리턴값(o) 함수 예) int get()
//            Consumer(소비자) 함수 : 매개변수(o), 리턴값(x) 함수 예) void accept(int t)
//            Function(일반) 함수 : 매개변수(o), 리턴값(o) 함수 예) int apply(int t)
//            Predicate(논리(명제)) 함수 : 매개변수(o), 리턴값(o,참/거짓)
//                                                     함수 예) boolean apply(int t)
        Supplier<Integer> s = () -> (int)(Math.random()*100) + 1;//1~100까지 랜덤수
        Consumer<Integer> c = i -> System.out.println(i + ","); // i 출력 함수
        Predicate<Integer> p = i -> i%2 == 0; // 2의 배수만 리턴하는 함수
        Function<Integer, Integer> f = i -> i/10*10; // i의 값중 1의 자리를 없애는 함수
                                                     // 예) 9.7 -> 90
//        결과 실행
        List<Integer> list = new ArrayList<>();
//       TODO: 정적함수를 호출하면 마지막 매개변수(배열)에 값이 저장되어 리턴됨(화면출력됨)
        makeRandomList(s, list);
        System.out.println(list); // 결과 출력 : 1~100까지 랜덤수가 화면출력됨
        System.out.println("--------------------------------");
        printEventNum(p, c, list); // 결과 : 배열에 짝수인것만 화면에 출력
        System.out.println("---------------------------------");
        List<Integer> list2 = doSomething(f, list);
        System.out.println(list2); // 결과 : 일의 자리를 없앤 배열

    }
}
