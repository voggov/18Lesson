public class StozleProduct extends WineglassBuilder{
    @Override
    public void buildProd() {
        wineglass.setProduction("Stozle");
    }

    @Override
    public void buildMaterial() {
        wineglass.setMaterial("Стекло");
    }

    @Override
    public void buildPrice() {
        wineglass.setPrice(2000);
    }
}
