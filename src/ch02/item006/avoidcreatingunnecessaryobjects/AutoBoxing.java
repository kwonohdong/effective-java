package ch02.item006.avoidcreatingunnecessaryobjects;

/**
 * 기존 객체를 재사용해야 한다면 새로운 객체를 만들지 마라
 * 단, 새로운 객체를 만들어야 한다면 기존 객체를 재사용하지 마라
 */
public class AutoBoxing {
    /**
     * Long 객체를 이용하여 합계 도출 시 불필요한 객체 생성으로 인한 성능 문제 발생
     * @return
     */
    private static long sum1() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }
    private static long sum2() {
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        long st = System.currentTimeMillis();
        sum1();
        long et = System.currentTimeMillis();
        System.out.println(et - st + " ms");

        st = System.currentTimeMillis();
        sum2();
        et = System.currentTimeMillis();
        System.out.println(et - st + " ms");
    }
}
