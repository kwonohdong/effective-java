package ch02.item006.avoidcreatingunnecessaryobjects;

import java.util.regex.Pattern;

/**
 * 생성 비용이 아주 비싼 객체가 반복해서 필요하다면 캐싱하여 재사용할 것
 */
public class RomanNumerals {
    static boolean isRomanNumeralProblem(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3}" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$)");
    }

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3}" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$)");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    public static void main(String[] args) {
        String s = "asjkdfljask81283812asldfjkas;dfka282";

        long st = System.nanoTime();
        isRomanNumeralProblem(s);
        long et = System.nanoTime();
        System.out.println(et - st + " ns");

        st = System.nanoTime();
        isRomanNumeral(s);
        et = System.nanoTime();
        System.out.println(et - st + " ns");
    }
}
