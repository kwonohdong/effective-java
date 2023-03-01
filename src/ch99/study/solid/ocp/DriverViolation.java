package ch99.study.solid.ocp;

public class DriverViolation {
    public static void main(String[] args) {
        Bus_V bus = new Bus_V();
        bus.drive();

        Truck_V truck = new Truck_V();
        truck.drive();
    }
}

class Bus_V {
    public void drive() {
        System.out.println("버스 운전");
    }
}

class Truck_V {
    public void drive() {
        System.out.println("트럭 운전");
    }
}