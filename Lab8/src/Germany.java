public class Germany extends Flag {
    private String[] colours = {"Черная","Красная","Желтая"};
    private int count = 0;

    @Override
    void setCountryName() {
        System.out.println("Германия:");
    }

    @Override
    void setColors() {
        System.out.print(colours[count++]);

    }
}
