package ch02.item003.singleton;

public class Singleton1 {
    /**
     * public 으로 싱글톤 객체를 바로 제공하므로, 해당 클래스가 싱글턴임이 API에 명백히 드러난다.
     */
    public static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1() {
        // AccessibleObject.setAccessible 사용해 private 생성자 호출 방지
        throw new AssertionError();
    }

    /**
     * 싱글턴임을 보장해주는 메소드
     * @return
     */
    private Object readResolve() {
        // 최초 생성된 인스턴스를 반환하고, 가짜 인스턴스는 가비지 컬렉터에 맡긴다.
        return INSTANCE;
    }
}
