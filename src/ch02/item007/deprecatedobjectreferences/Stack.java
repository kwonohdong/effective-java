package ch02.item007.deprecatedobjectreferences;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public Object popProblem() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        // 계속해서 스택 인스턴스가 커졌다 작아졌다 반복할 경우 메모리 누수가 발생함
        return elements[--size];
    }

    /**
     * 자기 메모리를 직접 관리하는 클래스라면 객체 참조를 null 처리하도록 한다.
     * @return
     */
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null; // 다 쓴 참조 해제

        return result;
    }

    private void ensureCapacity() {
        if(elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public int size() {
        return this.size;
    }
}
