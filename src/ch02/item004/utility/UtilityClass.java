package ch02.item004.utility;

/**
 * 인스턴스를 만들 수 없는 유틸리티 클래스
 */
public class UtilityClass {
    /**
     * 인스턴스화 방지 (이는 상속을 불가능하게 하는 효과도 있다.)
     */
    private UtilityClass() {
        throw new AssertionError();
    }
}
