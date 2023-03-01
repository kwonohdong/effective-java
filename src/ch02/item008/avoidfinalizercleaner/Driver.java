package ch02.item008.avoidfinalizercleaner;

public class Driver {
    public static void main(String[] args) {
        try (Room myRoom = new Room(15)) {
            System.out.println("안녕");
        }

        new Room(7);
        System.out.println("흠흠흠");
    }
}
