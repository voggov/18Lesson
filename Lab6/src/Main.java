public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();

        UsersChannel first = new FirstAir(dispatcher);
        UsersChannel second = new SecondAirplane(dispatcher);

        dispatcher.addAirs(first);
        dispatcher.addAirs(second);

        first.setMessageUp();
        second.setMessageDown();

    }
}
