package pattern.singleton;

import java.io.Serializable;

public class SerializeSingleton001 implements Serializable {
    public static final SerializeSingleton001 INSTANCE = new SerializeSingleton001();

    private SerializeSingleton001() {
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
