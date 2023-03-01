package ch99.study.solid.lsp;

public class Whale implements Animal {

    @Override
    public void eat(String food) {
        System.out.println(food + "을/를 먹다.");
    }

    @Override
    public void sleep() {
        System.out.println("잔다.");
    }
}