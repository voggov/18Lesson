public class Russia extends Flag{
    private String[] colours = {"Белая","Синяя","Красная"};
    private int count = 0;

    @Override
    void setCountryName() {
        System.out.println("России:");
    }

    @Override
    void setColors() {
        System.out.print(colours[count++]);
    }
}
