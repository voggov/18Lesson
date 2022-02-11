public class Main {
    public static void main(String[] args) {
        Stage stage = new Caterpillar();
        Butterfly butterfly = new Butterfly(stage);
        for (int i = 0; i < 3; i++) {
            butterfly.doIt();
            butterfly.grow();
        }


    }
}
