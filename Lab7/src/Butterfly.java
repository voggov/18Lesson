public class Butterfly {
    private Stage stage;

    public Butterfly(Stage stage) {
        this.stage = stage;
    }
    void setStage(Stage stage){
        this.stage = stage;
    }
    void grow(){
        if (stage instanceof Caterpillar){
            setStage(new Chrysalis());
        } else if (stage instanceof Chrysalis){
            setStage(new ButterflyIsReady());
        } else if (stage instanceof ButterflyIsReady){
            System.out.println("Некуда расти");
        }
    }
    void doIt(){
        stage.doIt();
    }
}
