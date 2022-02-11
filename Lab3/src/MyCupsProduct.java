public class MyCupsProduct extends WineglassBuilder{

    @Override
    public void buildProd() {
        wineglass.setProduction("MyCups");
    }

    @Override
    public void buildMaterial() {
        wineglass.setMaterial("Бумага");
    }

    @Override
    public void buildPrice() {
        wineglass.setPrice(2);
    }
}
