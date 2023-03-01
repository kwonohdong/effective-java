package ch02.item005.dependantobjectstate;

import ch02.item003.singleton.Singleton1;

import java.util.List;
import java.util.Objects;

/**
 * 클래스가 내부적으로 하나 이상의 자원에 의존하고, 그 자원이 클래스 동작에 영향을 준다면 싱클턴과 정적 유틸리티 클래스는 사용하지 않는 것이 좋다.
 * 이 자원들을 클래스가 직접 만ㄴ들게 해서도 안 된다.
 * 대신 필요한 자원을 (혹은 그 자원을 만들어주는 팩터리를) 생성자에 (혹은 정적 팩터리나 빌더에) 넘겨주자.
 * 의존 객체 주입이라 하는 이 기법은 클래스의 유연성, 재사용성, 테스트 용이성을 기막히게 개선해준다.
 */
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static boolean isValid(String word) {
        return true;
    }

    public List<String> suggestions(String typo) {
        return null;
    }
}
