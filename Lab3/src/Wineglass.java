public class Wineglass {
    private String production;
    private String material;
    private int price;

    public void setProduction(String production) {
        this.production = production;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void printInfo(){
        System.out.println("Производитель: " + this.production +
                "\nМатериал бокала: " + this.material +
                "\nЦена бокала: " + this.price + "руб.");
    }
}
