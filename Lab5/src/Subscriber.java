import java.util.List;

public class Subscriber implements Observer{
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> list) {
        System.out.println("Товарищ " + this.name + "\nИнформативное сообщение::\n" + list + "\n////////////////////////////////////////////////////");
    }
}
