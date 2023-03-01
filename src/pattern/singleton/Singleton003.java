package pattern.singleton;

/**
 * 대부분의 상황에서 원소가 하나뿐인 열거 타입이 싱글턴을 만드는 가장 좋은 방법이다.
 * 단, Enum 외의 클래스를 상속해야 한다면, 이 방법은 사용할 수 없다. (다른 인터페이스를 구현하도록 선언할 수는 있다)
 */
public enum Singleton003 {
    INSTANCE;
}
