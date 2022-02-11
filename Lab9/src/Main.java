public class Main {
    public static void main(String[] args) {
        PuyClass puyClass = new PuyClass();
        puyClass.setPuy(new CardPuy());
        puyClass.executePuy();

        puyClass.setPuy(new CashPay());
        puyClass.executePuy();

        puyClass.setPuy(new CoinsPuy());
        puyClass.executePuy();

        puyClass.setPuy(new TransferPuy());
        puyClass.executePuy();
    }
}
