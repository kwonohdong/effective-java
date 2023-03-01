package ch99.study.solid.isp;

public class Tesla implements Car, ElectricCar {

    @Override
    public String autoDrive() {
        return null;
    }

    @Override
    public String autoParking() {
        return null;
    }

    @Override
    public String drive() {
        return null;
    }

    @Override
    public String carBreak() {
        return null;
    }
}
