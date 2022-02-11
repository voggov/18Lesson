public abstract class Flag {

    public void printFlag() {
        System.out.print("Флаг ");setCountryName();
        setColors();
        System.out.println(" полоса");
        setColors();
        System.out.println(" полоса");
        setColors();
        System.out.println(" полоса");

    }

    abstract void setCountryName();

    abstract void setColors();
}
