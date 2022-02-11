public abstract class WineglassBuilder {
    Wineglass wineglass;

    public void createWineglass(){
        this.wineglass = new Wineglass();
    }

    public abstract void buildProd();
    public abstract void buildMaterial();
    public abstract void buildPrice();

    public Wineglass getWineglass(){
        return this.wineglass;
    }
}
