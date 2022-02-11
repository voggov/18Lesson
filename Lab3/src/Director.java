public class Director {
    WineglassBuilder builder;
    public Director(WineglassBuilder builder) {
        this.builder = builder;
    }

    public Wineglass buildWineglass(){
        builder.createWineglass();
        this.builder.buildProd();
        this.builder.buildPrice();
        this.builder.buildMaterial();

        Wineglass wineglass = builder.getWineglass();
        return wineglass;
    }
}
