package pattern.singleton;

public class Singleton002 {
    /**
     * API를 바꾸지 않고도 싱글턴이 아니게 변경할 수 있다는 점이다.
     * 호출하는 스레드별로 다른 인스턴스를 넘겨주게 할 수 있다.
     */
    private static final Singleton002 INSTANCE = new Singleton002();

    private Singleton002() {
        // AccessibleObject.setAccessible 사용해 private 생성자 호출 방지
        throw new AssertionError();
    }

    /**
     * @return
     */
    public static Singleton002 getInstance() {
        return INSTANCE;
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
