package solid.scp;

public class SuperMarket {
    private String owner;   // 주인
    private String snack;   // 과자
    private int snackCount; // 과자 갯수

    public int getSnackCount() {
        return this.snackCount;
    }

    /**
     * 슈퍼마켓 클래스에서 결제 행위를 정의하였기에, 단일 책임 원칙을 위배한다. 이는 클래스의 분리가 필요함
     */
    public void pay() {}
}
