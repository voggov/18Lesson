public enum TypeCoffe implements Coffe {
    ESPRESSO("Эспрессо"),
    LATTE("Латте"),
    CAPPUCCINO("Капучино"),
    AMERICANO("Американо");

    private String name;

    TypeCoffe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Coffe give(String name) {
        return null;
    }
}
